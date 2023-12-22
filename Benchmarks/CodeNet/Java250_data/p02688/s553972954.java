import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);
		
		int N = scr.nextInt();
		int K = scr.nextInt();
		int d = 0;
		int A;
		int result = 0;
		
		int []Ns = new int [N];
		
		for(int i = 0;i < K;i++) {
			d = scr.nextInt();
			for(int j = 0;j < d;j++) {
				A = scr.nextInt();
				Ns[A-1] = 1;
			}
		}
		
		for(int i = 0;i < N;i++) {
			if(Ns[i] == 0) {
				result += 1;
			}
		}
		
		System.out.println(result);
		
	}
}