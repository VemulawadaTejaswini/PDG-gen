import java.util.*;

import static java.lang.System.*;
import static java.lang.Math.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	//E→ F | E*F | E/F
	//F→ D | F+D | F-D

	enum T{
		d,
		p
	};
	public T type;

	public String str;

	public void next(){
		str=sc.next();
		if(str.matches("[0-9]+")){
			type=T.d;
		}else{
			type=T.p;
		}
	}

	public int E(){
		int l=F();
		char exp=str.toCharArray()[0];
		while(exp=='*' || exp=='/'){
			next();
			int r=F();
			if(exp=='*')
				l*=r;
			else
				l/=r;
			exp=str.toCharArray()[0];
		}
		return l;
	}
	public int F(){
		int l=Integer.parseInt(str);
		next();
		char exp=str.toCharArray()[0];
		while(exp=='+' || exp=='-'){
			next();
			int r=Integer.parseInt(str);
			if(exp=='+')l+=r;
			else l-=r;

			next();
			exp=str.toCharArray()[0];
		}
		return l;
	}

	public void run() {
		next();
		ln(E());
	}
	public static void main(String[] args) {
		new Main().run();
	}

	public int[] nextIntArray(int n){
		int[] res=new int[n];
		for(int i=0;i<n;i++){
			res[i]=sc.nextInt();
		}
		return res;
	}
	public static void pr(Object o) {
		out.print(o);
	}
	public static void ln(Object o) {
		out.println(o);
	}
	public static void ln() {
		out.println();
	}
}