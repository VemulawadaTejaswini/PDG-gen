import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	void run(){
		int[] a=new int[10000];
		int[] b=new int[10000];
		for(;;){
			int n=sc.nextInt();
			int k=sc.nextInt();
			int m=sc.nextInt()-1;
			if(n==0){
				break;
			}
			Arrays.fill(a, -1);
			for(int i=0; i<n; i++){
				a[i]=i+1;
			}
			int p=m;
			for(int j=n-1; j>0; j--){
				//println("a:"+Arrays.toString(a));
				System.arraycopy(a, 0, b, 0, a.length);
				//println("b:"+Arrays.toString(b));
				System.arraycopy(b, p+1, a, p, n-(p+1));
				//println("a2:"+Arrays.toString(a));
				p=(p+k-1)%j;
			}
			println(""+a[0]);
		}
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