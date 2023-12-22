import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int x = scan.nextInt()-1;
		int y = scan.nextInt()-1;

		int[] dist = new int[n - 1];

		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				int a = j-i;
				int b = Math.min(Math.abs(x-i)+1+Math.abs(y-j) , Math.abs(y-i)+1+Math.abs(x-j));
				dist[Math.min(a, b)-1]++;
			}
		}
		
		for(int i = 0; i < n-1; i++) {
			System.out.println(dist[i]);
		}
	}

}