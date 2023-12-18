import java.io.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Dice d1 = new Dice(br.readLine());
			Dice d2 = new Dice(br.readLine());
			while(true){
				if(check(d1,d2)){
					System.out.println("Yes");
					break;
				}
				d2.save();
				d2.simN();
				if(check(d1,d2)){
					System.out.println("Yes");
					break;
				}
				d2.simN();
				if(check(d1,d2)){
					System.out.println("Yes");
					break;
				}
				d2.load();
				d2.simE();
				if(check(d1,d2)){
					System.out.println("Yes");
					break;
				}
				d2.simE();
				if(check(d1,d2)){
					System.out.println("Yes");
					break;
				}
				d2.load();
				d2.simW();
				if(check(d1,d2)){
					System.out.println("Yes");
					break;
				}
				d2.load();
				d2.simS();
				if(check(d1,d2)){
					System.out.println("Yes");
					break;
				}
				System.out.println("No");
				break;
			}
		} catch(IOException e){
			System.out.println("Exception :" + e);
		}
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
	private int s_top;
	private int s_forth;
	private int s_right;
	private int s_left;
	private int s_back;
	private int s_bottom;
	Dice(String label){
		String lab[] = label.split(" ", 0);
		top    = Integer.parseInt(lab[0]);
		forth  = Integer.parseInt(lab[1]);
		right  = Integer.parseInt(lab[2]);
		left   = Integer.parseInt(lab[3]);
		back   = Integer.parseInt(lab[4]);
		bottom = Integer.parseInt(lab[5]);
	}
	public void save(){
		s_top    = top;
		s_forth  = forth;
		s_right  = right;
		s_left   = left;
		s_back   = back;
		s_bottom = bottom;
	}
	public void load(){
		top    = s_top;
		forth  = s_forth;
		right  = s_right;
		left   = s_left;
		back   = s_back;
		bottom = s_bottom;
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