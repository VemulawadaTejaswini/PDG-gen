import java.io.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			Dice d[] = new Dice[n];
			int i, j;
			int flg=0;

			for(i=0; i<n; i++){
				d[i] = new Dice(br.readLine());
			}

			for(i=0; i<n-1; i++){
				for(j=i+1; j<n; j++){
					if(neCheck(d[i],d[j])){
						flg = 1;
						break;
					}
				}
				if(flg==1) break;
			}

			if(flg==0) System.out.println("Yes");
			else       System.out.println("No");
		} catch(IOException e){
			System.out.println("Exception :" + e);
		}
	}
	public static boolean neCheck(Dice d1, Dice d2){
		if(rightCheck(d1,d2)) return true;
		d2.simN();
		if(rightCheck(d1,d2)) return true;
		d2.simN();
		if(rightCheck(d1,d2)) return true;
		d2.simN();
		if(rightCheck(d1,d2)) return true;
		d2.simN();
		d2.simE();
		if(rightCheck(d1,d2)) return true;
		d2.simE();
		if(rightCheck(d1,d2)) return true;
		d2.simE();
		if(rightCheck(d1,d2)) return true;
		return false;
	}
	public static boolean rightCheck(Dice d1, Dice d2){
		if(check(d1,d2)) return true;
		d2.simR();
		if(check(d1,d2)) return true;
		d2.simR();
		if(check(d1,d2)) return true;
		d2.simR();
		if(check(d1,d2)) return true;
		d2.simR();
		return false;
	}
	public static boolean check(Dice d1, Dice d2){
		if((d1.getTop()==d2.getTop())&&(d1.getForth()==d2.getForth())&&
			(d1.getRight()==d2.getRight())&&(d1.getLeft()==d2.getLeft())&&
			(d1.getBack()==d2.getBack())&&(d1.getBottom()==d2.getBottom())){
			return true;
		} else{
			return false;
		}
	}
}
class Dice{
	private int top;
	private int forth;
	private int right;
	private int left;
	private int back;
	private int bottom;
	Dice(String label){
		String lab[] = label.split(" ", 0);
		top    = Integer.parseInt(lab[0]);
		forth  = Integer.parseInt(lab[1]);
		right  = Integer.parseInt(lab[2]);
		left   = Integer.parseInt(lab[3]);
		back   = Integer.parseInt(lab[4]);
		bottom = Integer.parseInt(lab[5]);
	}
	public void simN(){
		int work;
		work   = top;
		top    = forth;
		forth  = bottom;
		bottom = back;
		back   = work;
	}
	public void simE(){
		int work;
		work   = top;
		top    = left;
		left   = bottom;
		bottom = right;
		right  = work;
	}
	public void simW(){
		int work;
		work   = top;
		top    = right;
		right  = bottom;
		bottom = left;
		left   = work;
	}
	public void simS(){
		int work;
		work   = top;
		top    = back;
		back   = bottom;
		bottom = forth;
		forth  = work;
	}
	public void simR(){
		int work;
		work   = forth;
		forth  = right;
		right  = back;
		back   = left;
		left   = work;
	}
	public void simL(){
		int work;
		work   = forth;
		forth  = left;
		left   = back;
		back   = right;
		right  = work;
	}
	public int getTop(){
		return top;
	}
	public int getForth(){
		return forth;
	}
	public int getRight(){
		return right;
	}
	public int getLeft(){
		return left;
	}
	public int getBack(){
		return back;
	}
	public int getBottom(){
		return bottom;
	}
}