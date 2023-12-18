import java.util.*;
import java.lang.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		long[]X = new long[N];
		long[]Y = new long[N];
		long range =0;
		int count =0;

		for(int i=0; i<N; i++){
		X[i] =sc.nextLong();
		Y[i] =sc.nextLong();
		range=(long)Math.hypot(X[i],Y[i]);
			if(range <=D){
			count++;
			}
		}

		System.out.println(count);				

	}//main

}//Distance
