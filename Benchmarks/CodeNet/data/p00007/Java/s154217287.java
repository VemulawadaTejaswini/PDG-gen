import java.util.Scanner;

class Main {
    public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	double debt = 100; //100,000 / 1,000
	double interest = 0;

	for (int i=0; i<n; i++) {
	    interest = debt * 0.05;
	    debt += interest;
	    debt = Math.ceil(debt);
	}

	System.out.printf("%.0f\n", (debt*1000));
    }
}