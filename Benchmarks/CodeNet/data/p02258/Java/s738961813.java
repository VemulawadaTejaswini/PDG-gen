import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int data[] = new int[n];
		int minv , maxv;
		
		for (int i = 0; i < n; i++) {
			data[i] = scan.nextInt();
		}
		
		scan.close();
		
		maxv = data[1] - data[0];
		minv = data[0];
		
		for (int j = 1; j < n ; j++) {
			maxv = Math.max(maxv, (data[j] - minv));
			minv = Math.min(minv, data[j]);
		}
		
		System.out.println(maxv);
	}
}

