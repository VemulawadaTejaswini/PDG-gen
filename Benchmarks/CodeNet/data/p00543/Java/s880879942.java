import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int A[] = new int[N];
		for(int i = 0; i < N ; i++){
			A[i] = scan.nextInt();
		}
		for(int i = 2 ; i <= M ; i++){
			for(int j = 0 ; j < N-1 ; j++){
				if(A[j] % i > A[j+1] % i){
					int koukann = A[j];
					A[j] = A[j+1];
					A[j+1] = koukann;
				}
			}
		}
		for(int i = 0; i < N ; i++){
			System.out.println(A[i]);
		}
	}
}