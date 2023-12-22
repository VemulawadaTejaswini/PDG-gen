import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	int n = sc.nextInt();
	    	int[] p = new int[n];
	    	int max = 0;
	    	int count = 0;
	    	for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
			if (p[i] > max) {
				max = p[i];
			}
		}
	    	for (int i : p) {
			count += i;
		}
	    	System.out.println(count - (max /2));
	}
}
