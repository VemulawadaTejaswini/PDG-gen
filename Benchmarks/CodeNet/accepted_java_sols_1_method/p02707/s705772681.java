import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A [] = new int[200001];
		int j = 0;
		
		for(int i =1; i<N; i++) {
			j = sc.nextInt();
			A[j] = A[j]+1;
			j++;
		}
		
		for(int i=1; i<N+1; i++) {
			if(A[i] > 0) {
				System.out.println(A[i]);
			}else{
				A[i] = 0;
				System.out.println(A[i]);
			}
		}
		
		sc.close();
	}
}