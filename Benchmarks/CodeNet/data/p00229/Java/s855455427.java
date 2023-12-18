
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		while(true){
			Slot slot = new Slot(sn.nextInt(), sn.nextInt(), sn.nextInt(), sn.nextInt(), sn.nextInt(), sn.nextInt());
			if(slot.isEnd()) break;
			System.out.println(100 + slot.getBenefit() - slot.getLost());
		}
		
	}
}

class Slot{
	int b, r, g, c, s, t;
	Slot(int b, int r, int g, int c, int s, int t){
		this.b = b;
		this.r = r;
		this.g = g;
		this.c = c;
		this.s = s;
		this.t = t;
	}
	
	int getLost(){
		return  (t-5*b-3*r-s)*3 + (5*b+3*r)*2;
	}
	
	int getBenefit(){
		return b*15+r*15+g*7+c*2 + (b*5+r*3)*15;
	}
	
	boolean isEnd(){
		return b+r+g+c+s+t == 0;
	}
}