import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc;
	public void run(){
		sc = new Scanner(System.in);
		while(sc.hasNext()){
			String n = sc.next();
			if(n.equals("#")){
				break;
			}
			else{
				calc(n);
			}
		}
	}
	String s;
	public void calc(String line){
		s = line;
		Equation tree = makeEquation();
		
		boolean ans = true;
		
		for(int a = 0; a < 2; a++){
			for(int b = 0; b < 2; b++){
				for(int c = 0; c < 2; c++){
					for(int d = 0; d < 2; d++){
						for(int e = 0; e < 2; e++){
							for(int f = 0; f < 2; f++){
								for(int g = 0; g < 2; g++){
									for(int h = 0; h < 2; h++){
										for(int i = 0; i < 2; i++){
											for(int j = 0; j < 2; j++){
												for(int k = 0; k < 2; k++){
													boolean t = tree.calc(a, b, c, d, e, f, g, h, i, j, k);
													if(!t) ans = false;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if(ans) System.out.println("YES");
		else System.out.println("NO");
	}
	public Equation makeEquation(){
		Formula f1 = makeFormula();
		if(s.substring(0,1).equals("=")){
			s = s.substring(1);
		}
		else return null;
		Formula f2 = makeFormula();
		return new Equation(f1, f2);
	}
	public Formula makeFormula(){
		String now = s.substring(0,1);
		s = s.substring(1);
		
		if(now.equals("T")) return new BoolFormula(1);
		else if(now.equals("F")) return new BoolFormula(0);
		else if(now.equals("-")){
			Formula f1 = makeFormula();
			return new NotFormula(f1);
		}
		else if(now.equals("(")){
			Formula f1 = makeFormula();
			String now2 = s.substring(0,1);
			s = s.substring(1);
			if(now2.equals("*")){
				Formula f2 = makeFormula();
				s = s.substring(1);
				return new AndFormula(f1, f2);
			}
			else if(now2.equals("+")){
				Formula f2 = makeFormula();
				s = s.substring(1);
				return new OrFormula(f1, f2);
			}
			else{
				s = s.substring(1);
				Formula f2 = makeFormula();
				s = s.substring(1);
				return new ImpFormula(f1, f2);
			}
		}
		else return new StringFormula(s);
	}
	public static void main(String[] args){
		new Main().run();
	}
}

class Equation{
	Formula value1;
	Formula value2;
	Equation(Formula v1, Formula v2){
		this.value1 = v1;
		this.value2 = v2;
	}
	boolean calc(int a, int b, int c, int d, int e, int f, int g, int h,
			int i, int j, int k){
		int v1 = value1.calc(a, b, c, d, e, f, g, h, i, j, k);
		int v2 = value2.calc(a, b, c, d, e, f, g, h, i, j, k);
		if(v1 == v2) return true;
		else return false;
	}
}

class Formula{
	int calc(int a, int b, int c, int d, int e, int f, int g, int h,
			int i, int j, int k) {
		return 0;
	}
	
}
class BoolFormula extends Formula{
	int value;
	BoolFormula(int b){
		this.value = b;
	}
	int calc(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k){
		return value;
	}
}
class StringFormula extends Formula{
	String value;
	StringFormula(String c){
		this.value = c;
	}
	int calc(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k){
		if(value.equals("a")) return a;
		else if(value.equals("b")) return b;
		else if(value.equals("c")) return c;
		else if(value.equals("d")) return d;
		else if(value.equals("e")) return e;
		else if(value.equals("f")) return f;
		else if(value.equals("g")) return g;
		else if(value.equals("h")) return h;
		else if(value.equals("i")) return i;
		else if(value.equals("j")) return j;
		else  return k;
	}
}
class NotFormula extends Formula{
	Formula value;
	NotFormula(Formula v){
		this.value = v;
	}
	int calc(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k){
		int v = value.calc(a,b,c,d,e,f,g,h,i,j,k);
		if(v == 1) return 0;
		else return 1;
	}
}

class AndFormula extends Formula{
	Formula value1;
	Formula value2;
	int[][] ans;
	AndFormula(Formula v1, Formula v2){
		this.value1 = v1;
		this.value2 = v2;
		ans = new int[2][2];
		ans[1][1] = 1;
		ans[1][0] = 0;
		ans[0][1] = 0;
		ans[0][0] = 0;
	}
	int calc(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k){
		int v1 = value1.calc(a,b,c,d,e,f,g,h,i,j,k);
		int v2 = value2.calc(a,b,c,d,e,f,g,h,i,j,k);
		return ans[v1][v2];
	}
}
class OrFormula extends Formula{
	Formula value1;
	Formula value2;
	int[][] ans;
	OrFormula(Formula v1, Formula v2){
		this.value1 = v1;
		this.value2 = v2;
		ans = new int[2][2];
		ans[1][1] = 1;
		ans[1][0] = 1;
		ans[0][1] = 1;
		ans[0][0] = 0;
	}
	int calc(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k){
		int v1 = value1.calc(a,b,c,d,e,f,g,h,i,j,k);
		int v2 = value2.calc(a,b,c,d,e,f,g,h,i,j,k);
		return ans[v1][v2];
	}
}
class ImpFormula extends Formula{
	Formula value1;
	Formula value2;
	int[][] ans;
	ImpFormula(Formula v1, Formula v2){
		this.value1 = v1;
		this.value2 = v2;
		ans = new int[2][2];
		ans[1][1] = 1;
		ans[1][0] = 0;
		ans[0][1] = 1;
		ans[0][0] = 1;
	}
	int calc(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k){
		int v1 = value1.calc(a,b,c,d,e,f,g,h,i,j,k);
		int v2 = value2.calc(a,b,c,d,e,f,g,h,i,j,k);
		return ans[v1][v2];
	}
}