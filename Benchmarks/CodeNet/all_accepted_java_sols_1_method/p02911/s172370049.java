import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int[] A = new int[Q];
		int[] Point = new int[N];
		
		for(int i=0;i<Q;i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i=0;i<N;i++) {
			Point[i] += K -Q;
		}
		
		for(int i =0;i<Q;i++) {
			int correct = A[i] - 1;
			Point[correct] += 1;
		}
		
		for(int i:Point) {
			if(i>0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		
		sc.close();	
	}
}