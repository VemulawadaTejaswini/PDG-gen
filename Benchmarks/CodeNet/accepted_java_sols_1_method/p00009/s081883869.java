import java.util.Scanner;

class Main {
    public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	boolean prime[] = new boolean [1000000];

	while (scan.hasNext()) {
	    int n = scan.nextInt();
	    int count = -2;
	    
	    for(int i = 2; i <=n; i++) {
		if (prime[i]) continue;
		else {
		    for(int j = i*2; j <=n; j += i) {
			prime[j] = true;
		    }
		}
	    }

	    for (int k=0; k<=n; k++) {
		if(prime[k]) continue;
		count++;
	    }

	    System.out.println(count);
	}
    }
}