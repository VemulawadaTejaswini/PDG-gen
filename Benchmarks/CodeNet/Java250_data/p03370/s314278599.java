import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int N =sc.nextInt();	
			int X =sc.nextInt();
			int []A=new int[N];
			int Y=X;
			int min=100000;
						
				for(int i=0;i<N;i++){
					A[i]=sc.nextInt();
				}
				for(int i=0;i<N;i++){
					Y=Y-A[i];
				}
				for(int i=0;i<N;i++){
					min=Math.min(min,A[i]);
				}
			System.out.println(N+Y/min);
	}
}