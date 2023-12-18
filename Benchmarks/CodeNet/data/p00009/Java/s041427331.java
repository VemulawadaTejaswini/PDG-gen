import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	int MAX_VALUE = 1000000;
	boolean[] isPrime = new boolean[MAX_VALUE];
	for (int i = 2; i < MAX_VALUE; i++) {
	    isPrime[i] = true;
	}
	for (int i = 2; i < MAX_VALUE; i++) {
	    if (isPrime[i]) {
		for (int j = 2; i*j < MAX_VALUE; j++) {
		    isPrime[i*j] = false;
		}
	    }
	}
	int n, cnt;
	while (scan.hasNext()) {
	    n = Integer.parseInt(scan.nextLine());
	    cnt = 0;
	    for (int i = 2; i <= n; i++) {
		if (isPrime[i]) {
		    cnt++;
		}
	    }
	    System.out.println(cnt);
	}
    }
}