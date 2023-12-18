import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc;
	public void run(){
		sc = new Scanner(System.in);
		while(sc.hasNext()){
			String n = sc.next();
			if(n.equals(".")){
				break;
			}
			else{
				calc(n);
			}
		}
	}
	public void calc(String line){
		str = line;
		Formula tree = getTree();
		
		int ans = 0;
		for(int p = 0; p < 3; p++){
			for(int q = 0; q < 3; q++){
				for(int r = 0; r < 3; r++){
					int n = tree.calc(p, q, r);
					if(n == 2) ans++;
				}
			}
		}
		System.out.println(ans);
	}
	String str;
	
	public Formula getTree(){
		String s = str.substring(0,1);
		str = str.substring(1);
		
		if(s.equals("0") || s.equals("1") || s.equals("2")){
			return new NumFormula(Integer.valueOf(s));
		}
		else if(s.equals("P") || s.equals("Q") || s.equals("R")){
			return new StringFormula(s);
		}
		else if(s.equals("-")){
			Formula f = getTree();
			return new NotFormula(f);
		}
		else{
			Formula f1 = getTree();
			s = str.substring(0,1);
			str = str.substring(1);
			Formula f2 = getTree();
			Formula f;
			if(s.equals("*")){
				f = new AndFormula(f1, f2);
			}
			else{
				f = new OrFormula(f1, f2);
			}
			str = str.substring(1);
			return f;
		}
	}
	public static void main(String[] args){
		new Main().run();
	}
}

class Formula{
	int calc(int p, int q, int r){
		return 0;
	}
}
class NotFormula extends Formula{
	Formula f1;
	int[] list = new int[]{2,1,0};
	NotFormula(Formula f){
		this.f1 = f;
	}
	int calc(int p, int q, int r){
		int c = f1.calc(p, q, r);
		return list[c];
	}
}
class AndFormula extends Formula{
	Formula f1;
	Formula f2;
	int[][] list = new int[][]{{0,0,0},{0,1,1},{0,1,2}};
	AndFormula(Formula f1, Formula f2){
		this.f1 = f1;
		this.f2 = f2;
	}
	int calc(int p, int q, int r){
		int c1 = f1.calc(p, q, r);
		int c2 = f2.calc(p, q, r);
		return list[c1][c2];
	}
}
class OrFormula extends Formula{
	Formula f1;
	Formula f2;
	int[][] list = new int[][]{{0,1,2},{1,1,2},{2,2,2}};
	OrFormula(Formula f1, Formula f2){
		this.f1 = f1;
		this.f2 = f2;
	}
	int calc(int p, int q, int r){
		int c1 = f1.calc(p,q,r);
		int c2 = f2.calc(p,q,r);
		return list[c1][c2];
	}
}
class NumFormula extends Formula{
	int num;
	NumFormula(int n){
		this.num = n;
	}
	int calc(int p, int q, int r){
		return num;
	}
}
class StringFormula extends Formula{
	String s;
	StringFormula(String s){
		this.s = s;
	}
	int calc(int p, int q, int r){
		if(s.equals("P")) return p;
		else if(s.equals("Q")) return q;
		else return r;
	}
}