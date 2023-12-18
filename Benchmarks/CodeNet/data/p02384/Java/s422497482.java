import java.io.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Dice d = new Dice(br.readLine());
			int q = Integer.parseInt(br.readLine());
			for(int i=0; i<q; i++){
				d.sim(br.readLine());
				System.out.println(d.getRight());
			}
		} catch(IOException e){
			System.out.println("Exception :" + e);
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
	public void sim(String order){
		String ord[] = order.split(" ", 0);
		int ordTop   = Integer.parseInt(ord[0]);
		int ordForth = Integer.parseInt(ord[1]);
		int work;

		if(ordTop==forth){
			work   = top;
			top    = forth;
			forth  = bottom;
			bottom = back;
			back   = work;
		} else if(ordTop==right){
			work   = top;
			top    = right;
			right  = bottom;
			bottom = left;
			left   = work;
		} else if(ordTop==left){
			work   = top;
			top    = left;
			left   = bottom;
			bottom = right;
			right  = work;
		} else if(ordTop==back){
			work   = top;
			top    = back;
			back   = bottom;
			bottom = forth;
			forth  = work;
		} else if(ordTop==bottom){
			work   = top;
			top    = forth;
			forth  = bottom;
			bottom = back;
			back   = work;
			work   = top;
			top    = forth;
			forth  = bottom;
			bottom = back;
			back   = work;
		}

		if(ordForth==right){
			work   = forth;
			forth  = right;
			right  = back;
			back   = left;
			left   = work;
		} else if(ordForth==left){
			work   = forth;
			forth  = left;
			left   = back;
			back   = right;
			right  = work;
		} else if(ordForth==back){
			work   = forth;
			forth  = right;
			right  = back;
			back   = left;
			left   = work;
			work   = forth;
			forth  = right;
			right  = back;
			back   = left;
			left   = work;
		}
	}
	public int getTop(){
		return top;
	}
	public int getRight(){
		return right;
	}
}