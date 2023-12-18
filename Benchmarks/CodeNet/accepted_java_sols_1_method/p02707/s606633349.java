import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A[] = new int[N-1];
		int result[] = new int[N];
		for(int i=0;i<N-1;i++) {
			A[i]=scan.nextInt();
		}
		for(int i=0;i<N;i++) {
			result[i] = 0;
		}
		for(int i : A) {
			result[i-1]++;
		}for(int i : result) {
			System.out.println(i);
		}

	}
}