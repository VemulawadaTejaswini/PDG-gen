import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		int N = in.nextInt();
		int K = in.nextInt();
		int Q = in.nextInt();
		int[] score = new int[N];

		int moreThan = Q - K; 

		int A = 0;
		for(int i = 0; i < Q; i++) {
			A = in.nextInt() -1;
			score[A] = score[A] + 1;
		}

		String YES = "Yes";
		String NO = "No";
		for(int i =0; i < N; i++) {
			System.out.println(moreThan < score[i] ? YES: NO);
		}
	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
	}
}