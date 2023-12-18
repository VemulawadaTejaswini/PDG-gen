import java.util.*;
import java.math.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		int[] T =new int[N];
		int sum=0;
		for(int i=0;i<N;i++) {
			T[i]=sc.nextInt();
			sum+=T[i];
		}
		int M=sc.nextInt();
		int[] P=new int[M];
		int[] X=new int[M];
		
		int[] rep = new int[M];
		
		for(int i=0;i<M;i++) {
			P[i]=sc.nextInt();
			X[i]=sc.nextInt();
			
			rep[i]=X[i]-T[P[i]-1];
		}
		
		for(int i=0;i<M;i++) {
			System.out.println(sum+rep[i]);
		}
		
		
	}

}