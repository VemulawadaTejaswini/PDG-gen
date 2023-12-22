import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int X = sc.nextInt();
		
		int min = Math.max(-1000000, X-(K-1));
		int max = Math.min(1000000, X+(K-1));
		
		for(int i=0;i<max-min+1;i++) {
			int p = min + i;
			System.out.print(p);
			if(p != max) {
				System.out.print(" ");
			}
		}
		
		sc.close();	
	}
}