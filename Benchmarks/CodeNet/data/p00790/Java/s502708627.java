import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			Dice d = new Dice(1,6,3,4,2,5);
			for(int i=0;i<n;i++){
				String s = sc.next();
				if(s.equals("north")){d.move(0);}
				if(s.equals("east")) {d.move(1);}
				if(s.equals("south")){d.move(0);d.move(0);d.move(0);}
				if(s.equals("west")) {d.move(1);d.move(1);d.move(1);}
			}

			System.out.println(d.t);
		}
	}
}

class Dice{
	int t,b,w,e,n,s;

	Dice(int t,int b,int w,int e,int n,int s){
		this.t = t;
		this.b = b;
		this.w = w;
		this.e = e;
		this.n = n;
		this.s = s;
	}

	void move(int dir){
		Dice d = this.copy();
		switch(dir){
		case 0:
			t = d.s;
			b = d.n;
			n = d.t;
			s = d.b;
			break;
		case 1:
			t = d.w;
			b = d.e;
			w = d.b;
			e = d.t;
			break;
		}
	}

	Dice copy(){
		return new Dice(t,b,w,e,n,s);
	}
}