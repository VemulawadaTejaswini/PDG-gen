import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int bfLength = 0;
	    long stepSum = 0;
	    for (int i = 0; i < n; i++) {
		    int a = sc.nextInt();
		    if (bfLength > a) {
		    	stepSum += (bfLength - a);
		    } else {
		    	bfLength = a;
		    }
	    }
	    System.out.println(stepSum);
	}
}