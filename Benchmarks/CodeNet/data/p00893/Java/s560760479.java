import java.util.*;
import static java.util.Arrays.*;

public class Main {

	String input;
	static final int mask = (1<<15)-1;
	int p;
	int[][][] values;
	
	int[][] copy2d(int[][] a){
		int[][] ret = new int[a.length][];
		for(int i=0; i<a.length; i++){
			ret[i] = a[i].clone();
		}
		return ret;
	}
	
	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			int n = Integer.parseInt(in.nextLine());
			if(n==0) return ;
			values = new int[0x100][][];
			for(int i=0; i<n; i++){
				input = in.nextLine();
				p = 0;
				assignment();
			}
			System.out.println("-----");
		}
	}

	void assignment(){
		int v = val();
		p++;
		int[][] e = expr();
		if(e == null) System.out.println("ERROR");
		p++;
		values[v] = copy2d(e);
		for(int i=0; i<values[v].length; i++){
			for(int j=0; j<values[v][i].length; j++){
				System.out.printf("%d%c", values[v][i][j], j==values[v][i].length-1?'\n':' ');
			}
		}
		return ;
	}
	
	int val(){
		return (int)input.charAt(p++);
	}

	int[][] expr(){
		int[][] t = term();
		while(input.charAt(p) == '+' || input.charAt(p) == '-'){
			boolean add = input.charAt(p++) == '+';
			int[][] tt = term();
			for(int i=0; i<t.length; i++){
				for(int j=0; j<t[0].length; j++){
					t[i][j] = (t[i][j] + (add?tt[i][j]:-tt[i][j]))&mask;
				}
			}
		}
		return t;
	}
	
	int[][] term(){
		int[][] f = factor();
		while(input.charAt(p) == '*'){
			p++;
			int[][] g = factor();
			if(f[0].length == g.length){
				int[][] h = new int[f.length][g[0].length];
				for(int i=0; i<f.length; i++){
					for(int j=0; j<g[0].length; j++){
						for(int k=0; k<f[0].length; k++){
							h[i][j] = (h[i][j] + f[i][k]*g[k][j])&mask;
						}
					}
				}
				f = copy2d(h);
			}
			else if(f.length == 1 && f[0].length==1){
				for(int i=0; i<g.length; i++){
					for(int j=0; j<g[i].length; j++){
						g[i][j] = (g[i][j]*f[0][0])&mask;
					}
				}
				f = copy2d(g);
			}
			else{
				for(int i=0; i<f.length; i++){
					for(int j=0; j<f[i].length; j++){
						f[i][j] = (f[i][j]*g[0][0])&mask;
					}
				}
			}
		}
		return f;
	}

	int[][] factor(){
		int[][] pr = primary();
		if(pr != null){
			return pr;
		}
		if(input.charAt(p) == '-'){
			p++;
			int[][] f = factor();
			for(int i=0; i<f.length; i++){
				for(int j=0; j<f[i].length; j++){
					f[i][j] = (-f[i][j])&mask;
				}
			}
			return f;
		}
		return null;
	}

	int[][] primary(){
		int[][] ret = primary1();
		if(ret == null) return null;
		while(input.charAt(p) == '(' || input.charAt(p) == '\''){
			if(input.charAt(p) == '('){
				p++;
				int[][] e1 = expr();
				p++;
				int[][] e2 = expr();
				p++;
				int[][] rr = new int[e1[0].length][e2[0].length];
				for(int i=0; i<e1[0].length; i++){
					for(int j=0; j<e2[0].length; j++){
						rr[i][j] = ret[e1[0][i]-1][e2[0][j]-1];
					}
				}
				ret = copy2d(rr);
				continue;
			}
			if(input.charAt(p) == '\''){
				p++;
				int[][] rr = new int[ret[0].length][ret.length];
				for(int i=0; i<ret.length; i++){
					for(int j=0; j<ret[0].length; j++){
						rr[j][i] = ret[i][j];
					}
				}
				ret = copy2d(rr);
				continue;
			}
		}
		return ret;
	}

	int[][] primary1(){
		int[][] inu = inum();
		if(inu != null){
			return inu;
		}
		if(Character.isUpperCase(input.charAt(p))){
			return copy2d(values[input.charAt(p++)]);
		}
		int[][] m = matrix();
		if(m != null){
			return m;
		}
		if(input.charAt(p) == '('){
			p++;
			int[][] e = expr();
			p++;
			return e;
		}
		return null;
	}

	int[][] matrix(){
		if(input.charAt(p) != '[') return null;
		p++;
		int[][] rs = row_seq();
		p++;
		return rs;
	}

	int[][] row_seq(){
		ArrayList<int[]> arr = new ArrayList<int[]>();
		int[][] r = row();
		for(int i=0; i<r.length; i++){
			arr.add(r[i].clone());
		}
		while(input.charAt(p) == ';'){
			p++;
			r = row();
			for(int i=0; i<r.length; i++){
				arr.add(r[i].clone());
			}
		}
		int[][] ret = new int[arr.size()][];
		for(int i=0; i<ret.length; i++){
			ret[i] = arr.get(i).clone();
		}
		return ret;
	}

	int[][] row(){
		int[][] e = expr();
		int h = e.length;
		ArrayList< ArrayList<Integer> > arr = new ArrayList< ArrayList<Integer> >();
		for(int i=0; i<h; i++)
			arr.add(new ArrayList<Integer>());
		for(int i=0; i<h; i++){
			for(int j=0; j<e[i].length; j++){
				arr.get(i).add(e[i][j]);
			}
		}
		while(input.charAt(p) == ' '){
			p++;
			e = expr();
			for(int i=0; i<h; i++){
				for(int j=0; j<e[0].length; j++){
					arr.get(i).add(e[i][j]);
				}
			}
		}
		int w = arr.get(0).size();
		int[][] ret = new int[h][w];
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				ret[i][j] = arr.get(i).get(j);
			}
		}
		return ret;
	}

	int[][] inum(){
		if(!Character.isDigit(input.charAt(p))){
			return null;
		}
		int ret = input.charAt(p++) - '0';
		while(Character.isDigit(input.charAt(p))){
			ret = 10*ret + input.charAt(p++) - '0';
		}
		int[][] re = new int[1][1];
		re[0][0] = ret;
		return re;
	}

	public static void main(String args[]){
		new Main().run();
	}
}