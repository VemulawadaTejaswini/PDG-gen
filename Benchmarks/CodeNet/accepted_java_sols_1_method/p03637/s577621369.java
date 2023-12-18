import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count = 0;
		int twoCount = 0;
		for (int i = 0; i < N; i++) {
			int val = sc.nextInt();
			if (val % 4 == 0) {
				count++;
			} else if (val % 2 == 0) {
				twoCount++;
			}
		}
		
		String ans = N / 2 <= count + (twoCount / 2) ? "Yes" : "No"; 
		System.out.println(ans);
	}
}