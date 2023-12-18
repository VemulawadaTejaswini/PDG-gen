import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			HashSet<Dice> set = new HashSet<Dice>();

			for(int i=0;i<n;i++){
				set.add(new Dice(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next()));
			}

			System.out.println(n - set.size());
		}
	}
}

class Dice{
	String t,b,w,e,n,s;

	Dice(String t,String s,String e,String w,String n,String b){
		this.t = t;
		this.s = s;
		this.e = e;
		this.w = w;
		this.n = n;
		this.b = b;
	}

	public boolean equals(Object o){
		Dice d = (Dice)o;

		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					if(this.equals2(d)) return true;
					d.move(0);
				}
				d.move(1);
			}
			d.move(2);
		}

		return false;
	}

	boolean equals2(Dice d){
		return
			t.equals(d.t) && b.equals(d.b) && w.equals(d.w) &&
			e.equals(d.e) && n.equals(d.n) && s.equals(d.s);
	}

	public int hashCode(){
		return 0;
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

		case 2:
			w = d.s;
			e = d.n;
			n = d.w;
			s = d.e;
			break;
		}
	}

	public String toString(){
		return String.format("[%s,%s,%s,%s,%s,%s]",t,s,e,w,n,b);
	}

	Dice copy(){
		return new Dice(t,s,e,w,n,b);
	}
}