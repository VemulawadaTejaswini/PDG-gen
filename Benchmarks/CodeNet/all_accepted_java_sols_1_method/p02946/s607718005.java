import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		int k = sc.nextInt();
    		int x = sc.nextInt();

    		int min = Math.max(x - (k-1), -1000000);
    		int max = Math.min(x + (k-1),  1000000);
    		for (int i=min; i<=max; i++) {
    			System.out.print(i);
    			System.out.print(" ");
    		}
    		System.out.println();

    	} finally {
    		sc.close();
    	}
    }
}

