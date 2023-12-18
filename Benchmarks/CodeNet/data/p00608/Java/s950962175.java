import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Indian Puzzle
public class Main{

	int n;
	char[] cand;
	int[] ref;
	boolean[] u;
	List<String> exs;
	
	char[] s;
	int id;
	
	char get(){
//		System.out.println("ID:" + id);
		if(Character.isUpperCase(s[id]))return cand[ref[s[id++]-'A']];
		else return s[id++];
	}
	
	double exp(){
		double res = fact();
		if(res==1<<28)return res;
		while(true){
			char c = get();
			if(c=='+'){
				double a = fact();
				if(a==1<<28)return a;
				res+=a;
			}
			else if(c=='-'){
				double a = fact();
				if(a==1<<28)return a;
				res-=a;
			}
			else break;
		}
		return res;
	}
	
	double fact(){
		double res = digit();
		if(res==1<<28)return res;
		while(true){
			char c = get();
			if(c=='*'){
				double a = digit();
				if(a==1<<28)return a;
				res*=a;
			}
			else if(c=='/'){
				double a = digit();
				if(a==1<<28||a==0)return a;
				res/=a;
			}
			else break;
		}
		id--;
		return res;
	}
	
	double digit(){
		double res = 0;
		char c = get();
		if(!Character.isDigit(c))return 1<<28;
		char next = get();
		if(c=='0'&&'1'<=next&&next<='9')return 1<<28;
		id--;
		while(Character.isDigit(c)){
			res = res*10 + (c-'0');
			c = get();
		}
		id--;
//		System.out.println("DIGIT RES:" + res);
		return res;
	}
	
	boolean assign(){
		boolean f = true;
		for(String t:exs){
			String[] r = t.split("=");
			id = 0;
			s = (r[0]+"$").toCharArray();
			double ex1 = exp();
//			System.out.println("EX1: " + s + " RES:" + ex1);
			if(ex1==1<<28)f = false;
			id = 0;
			s = (r[1]+"$").toCharArray();
			double ex2 = exp();
//			System.out.println("EX2: " + s + " RES:" + ex2);
			if(ex2==1<<28)f = false;
			if(Math.abs(ex1-ex2)<1e-6);
			else f = false;
			if(!f)return false;
		}
		return true;
	}
	
	boolean dfs(int k){
		if(k==n){
//			System.out.println("II");
			return assign();
		}
		for(int i=0;i<n;i++){
			if(u[i])continue;
			u[i] = true;
			ref[i] = k;
			if(dfs(k+1))return true;
			u[i] = false;
		}
		return false;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if((h|w)==0)break;
			char[][] m = new char[h][w];
			for(int i=0;i<h;i++)m[i]=sc.next().toCharArray();
			int k = 0;
			for(int i=0;i<h;i++)for(int j=0;j<w;j++)if(m[i][j]=='.')m[i][j]=(char)(k+++'A');
			exs = new ArrayList<String>();
			for(int i=0;i<h;i++){
				for(int j=0;j<w-1;j++){
					if(m[i][j]!='#'&&m[i][j+1]!='#'){
						StringBuilder sb = new StringBuilder();
						while(j<w&&m[i][j]!='#'){
							sb.append(m[i][j++]);
						}
						exs.add(sb.toString());
					}
				}
			}
			for(int j=0;j<w;j++){
				for(int i=0;i<h-1;i++){
					if(m[i][j]!='#'&&m[i+1][j]!='#'){
						StringBuilder sb = new StringBuilder();
						while(i<h&&m[i][j]!='#'){
							sb.append(m[i++][j]);
						}
						exs.add(sb.toString());
					}
				}
			}
			n = sc.nextInt();
			cand = new char[n];
			for(int i=0;i<n;i++)cand[i]=sc.next().charAt(0);
			ref = new int[n];
			u = new boolean[n];
			System.out.println(dfs(0)?"Yes":"No");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}