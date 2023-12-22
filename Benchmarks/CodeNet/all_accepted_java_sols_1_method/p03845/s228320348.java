import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		//System.out.println(N);
		int []n=new int[N];
		for(int i=0;i<n.length;i++){
			n[i]=sc.nextInt();
			//System.out.println(n[i]);
		}
		int M=sc.nextInt();
		for(int i=0;i<M;i++){
			int sum=0;
			int m=sc.nextInt();
			//System.out.println(m);
			//System.out.println(n[m-1]);
			int s=sc.nextInt();
			//System.out.println(s);
			int x=s-n[m-1];
			for(int j=0;j<N;j++){
				sum+=n[j];
			}
			sum+=x;
			System.out.println(sum);
		}
	}
}
