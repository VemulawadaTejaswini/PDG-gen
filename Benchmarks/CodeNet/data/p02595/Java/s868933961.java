import java.util.*;
import java.lang.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		float range =0;
		int count =0;

		for(int i=0; i<N; i++){
		int X =sc.nextInt();
		int Y =sc.nextInt();
		range=(float)Math.hypot(X,Y);
			if(range <=D){
			count++;
			}
		}

		System.out.println(count);				

	}//main

}//Distance
