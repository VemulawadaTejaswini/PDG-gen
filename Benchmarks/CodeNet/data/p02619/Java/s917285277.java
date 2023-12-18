import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int D;
	static final int PROB = 26;
	
	public static void main(String[] args) {
		scoring();
	}
	
	public static void scoring() {
		Scanner sc = new Scanner(System.in);
		
		D = sc.nextInt();
		
//		System.out.println("input c");
		
		int[] c = new int[PROB];
		Arrays.setAll(c, i -> sc.nextInt());
		
//		for (int n : c)
//			System.out.println(n);
		
//		System.out.println("input s");
		
		int[][] s = new int[D][PROB];
		for (int d = 0; d < D; d++) {
			Arrays.setAll(s[d], idx -> sc.nextInt());
		}
		
//		for (int[] arr : s)
//			for (int n : arr)
//				System.out.println(n);
		
//		System.out.println("input t");
		int[] t = new int[D];
		for (int d = 0; d < D; d++) {
			t[d] = sc.nextInt();
			t[d]--;
		}
		
//		for (int n : t)
//			System.out.println(n);
		
//		System.out.println("calc score");
		
		int[] last = new int[PROB];
		int sumScore = 0;
		for (int d = 0; d < D; d++) {
			int score = 0;
			
			score = s[d][t[d]];
			last[t[d]] = d;
			
//			System.out.println("calc sumC");
			int sumC = 0;
			for (int i = 0; i < PROB; i++) {
				sumC += c[i] * (d - last[i]);
			}
			
			score += sumC;
			
			sumScore += score;
		}
		
		System.out.println(sumScore);
	}
}


