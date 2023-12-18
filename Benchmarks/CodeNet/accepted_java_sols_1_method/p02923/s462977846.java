import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int N = sc.nextInt();
    		int[] Hi = new int[N];
    		for (int i=0; i<N; i++) {
    			Hi[i] = sc.nextInt();
    		}

    		int count = 0;
    		int maxCount = 0;
    		for (int i=0; i<N-1; i++) {
    			if (Hi[i] >= Hi[i+1]) {
    				count++;
    			} else {
    				count = 0;
    			}
    			if (count >= maxCount) {
    				maxCount = count;
    			}
    		}

    		System.out.println(maxCount);

    	} finally {
    		sc.close();
    	}
    }
}

