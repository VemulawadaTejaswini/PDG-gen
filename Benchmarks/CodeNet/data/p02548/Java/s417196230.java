import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	int cnt = 0;
    	for (int a = 1; a < n; a++) {
    		for (int b = 1; b < n; b++) {
    			if (a * b > n) {
    				break;
    			}
    			int c = n - a * b;
    			if (c > 0) {
    				cnt++;
    			}
    		}
    	}
    	System.out.println(cnt);
    }
}