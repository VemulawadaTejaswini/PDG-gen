import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// 2013/03/16
public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;

	int n;

	void run(){
		n=sc.nextInt();
		solve();
	}

	void solve(){
		for(int i=0;; i++){
			String s=(n-i)+"";
			if(n-i>=0&&new StringBuilder(s).reverse().toString().equals(s)){
				println(s);
				return;
			}
			s=(n+i)+"";
			if(new StringBuilder(s).reverse().toString().equals(s)){
				println(s);
				return;
			}
		}
	}

	void println(String s){
		System.out.println(s);
	}

	void debug(Object... os){
		System.err.println(deepToString(os));
	}

	public static void main(String[] args){
		new Main().run();
	}

}