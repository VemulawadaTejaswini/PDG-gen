import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int[] r = new int[n];
	    for (int i = 0; i < n; i++) {
			r[i] = scan.nextInt();
		}
	  
	    int min = r[0];
		int margin = r[1] - r[0];
		for (int i = 1; i < r.length; i++) {
			margin = Math.max(margin, r[i] - min);
			min = Math.min(min, r[i]);
		}
		
		System.out.println(margin);
	}
}