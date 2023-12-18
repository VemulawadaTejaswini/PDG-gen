import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.lang.Character.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// The Return of FizzBuzz
public class Main{
	Scanner sc=new Scanner(System.in);

	long INF=1L<<62;

	String in;

	void run(){
		for(int n=sc.nextInt(); n>0; n--){
			in=sc.next();
			solve();
		}
	}

	int n;
	long ans;

	void solve(){
		ans=INF;
		n=in.length();

		onlyChara();
		substring();
		partition();
		head();
		tail();
		headtail();

		ans=ans==INF?-1:(ans+1);
		println(ans+"");
	}

	void onlyChara(){
		StringBuilder first20=new StringBuilder();
		for(int i=1; i<=20; i++){
			first20.append(fizzbuzz(i));
		}
		ans=min(ans, indexOf(first20.toString(), in));
	}

	void substring(){
		for(int i=0; i<n; i++){
			for(int j=i; j<n; j++){
				update(toLong(in.substring(i, j+1)));
			}
		}
	}

	void partition(){
		for(int s1=0; s1<n; s1++){
			for(int t1=s1; t1<n; t1++){
				String st1=in.substring(s1, t1+1);
				for(int s2=t1+1; s2<n; s2++){
					for(int t2=s2; t2<n; t2++){
						String st2=in.substring(s2, t2+1);
						update(toLong(st2, st1));
						for(int i=0; i<10; i++){
							update(toLong(st2, ""+i, st1));
						}
					}
				}
			}
		}
	}

	// N [string]
	void head(){
		for(int t=0; t<n; t++){
			String st=in.substring(0, t+1);
			for(int i=0; i<10; i++){
				update(toLong(i+"", st));
			}
		}
	}

	// [string] N
	// [string] NN
	void tail(){
		for(int s=0; s<n; s++){
			String st=in.substring(s);
			for(int i=0; i<10; i++){
				update(toLong(st, ""+i));
				for(int j=0; j<10; j++){
					update(toLong(st, ""+i, ""+j));
				}
			}
		}
	}

	// N [string] N
	void headtail(){
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				update(toLong(""+i, in, ""+j));
			}
		}
	}

	long toLong(String... ss){
		long num=0;
		boolean OK=true;
		for(String s : ss){
			for(int i=0; i<s.length(); i++){
				num=num*10+s.charAt(i)-'0';
				OK&=isDigit(s.charAt(i));
			}
		}
		return OK?num:-1;
	}

	String fizzbuzz(long n){
		if(n%15==0){
			return "FizzBuzz";
		}else if(n%3==0){
			return "Fizz";
		}else if(n%5==0){
			return "Buzz";
		}else{
			return Long.toString(n);
		}
	}

	void update(long n){
		if(n<=0){ // NG
			return;
		}
		StringBuilder sb=new StringBuilder();
		for(long i=n-10; i<=n+10; i++){
			if(i>=1){
				sb.append(fizzbuzz(i));
			}
		}
		long left=max(n-11, 0);
		ans=min(ans, indexOf(sb.toString(), in)+length(left));
	}

	long indexOf(String s, String t){
		int at=s.indexOf(t);
		return at>=0?at:INF;
	}

	// [1,n]
	long length(long n){
		long length=0;
		long b=1;
		for(int i=1; i<=18; i++){
			// (left, right]
			long left=b-1, right=min(b*10-1, n);
			if(left>=right){
				break;
			}
			long nFizz=right/3-left/3;
			long nBuzz=right/5-left/5;
			long nFizzBuzz=right/15-left/15;
			long nString=nFizz+nBuzz-nFizzBuzz;
			length+=(right-left-nString)*i+nFizz*4+nBuzz*4;
			b*=10;
		}
		return length;
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}