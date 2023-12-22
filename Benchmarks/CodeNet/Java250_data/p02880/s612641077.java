import java.util.*;

class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    	int N = sc.nextInt();
    	for (int A = 1; A < 10; A++) {
    		for (int B = 1; B < 10; B++) {
    			if (A * B == N) {
    				System.out.println("Yes\n");
    				return;
    			}
    		}
    	}
    	System.out.println("No\n");
    }
}
