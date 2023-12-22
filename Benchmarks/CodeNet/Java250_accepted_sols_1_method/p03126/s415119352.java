import java.util.Scanner;

//Scanner sc = new Scanner(System.in);

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] loves = new int[M];
		for(int i = 0; i < N; i++){
			int K = sc.nextInt();
			for(int j = 0; j < K; j++){
				int A = sc.nextInt();
				loves[A-1]++; 
			}
		}
		int total = 0;
		for(int x: loves){
		  if(x == N) total++;
		}
		System.out.println(total);
	}
}
