import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] score = new int[N];
			for(int i=0;i<N;i++) {
				score[i] = sc.nextInt();
			}
			
			for(int j=0;j<N-K;j++) {
				if(score[j] < score[j+N-K-1]) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}
		}	
	}
}