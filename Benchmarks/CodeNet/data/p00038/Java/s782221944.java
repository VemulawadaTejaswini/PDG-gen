import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	int[] a;

	void run(){
		a=new int[13];
		sc.useDelimiter(",|\r\n");
		for(; sc.hasNext();){
			Arrays.fill(a, 0);
			for(int i=0; i<5; i++){
				a[sc.nextInt()-1]++;
				// debug(sc.nextInt());
			}
			solve();
		}
	}

	void solve(){
		if(fourCard())
			println("four card");
		else if(fullHouse())
			println("full house");
		else if(straight())
			println("straight");
		else if(threeCard())
			println("three card");
		else if(twoPair())
			println("two pair");
		else if(onePair())
			println("one pair");
		else
			println("null");
	}

	boolean fourCard(){
		for(int x : a){
			if(x==4){
				return true;
			}
		}
		return false;
	}

	boolean fullHouse(){
		boolean f2=false, f3=false;
		for(int x : a){
			f2|=x==2;
			f3|=x==3;
		}
		return f2&&f3;
	}

	boolean straight(){
		for(int i=0; i<10; i++){
			if(a[i]*a[i+1]*a[i+2]*a[i+3]*a[(i+4)%13]==1)
				return true;
		}
		return false;
	}

	boolean threeCard(){
		for(int x : a){
			if(x==3){
				return true;
			}
		}
		return false;
	}

	boolean twoPair(){
		int c=0;
		for(int x : a){
			if(x==2){
				c++;
			}
		}
		return c==2;
	}

	boolean onePair(){
		for(int x : a){
			if(x==2){
				return true;
			}
		}
		return false;
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}

}