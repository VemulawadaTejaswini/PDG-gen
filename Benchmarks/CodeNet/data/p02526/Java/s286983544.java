import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0; // 一致した数値の数
		
		int n = scan.nextInt();
		int[] S = new int[n];
		for (int i=0; i<n; i++)
			S[i] = scan.nextInt();
			
		int q = scan.nextInt();
		int[] T = new int[q];
		for (int i=0; i<q; i++)
			T[i] = scan.nextInt();
				
		for (int i=0; i<n; i++) {
			for (int j=0; j<q; j++) {
				if (S[i] == T[j]) {
					count++;
				}
			}	
		}		
		
		System.out.println(count);
	}	
}