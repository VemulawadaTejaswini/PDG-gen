import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int m = scan.nextInt();
	    long lr[][]=new long[m][2];
	    for(int i=0;i<m;i++) {
	    	lr[i][0]=scan.nextLong();
	    	lr[i][1]=scan.nextLong();
	    }
	    scan.close();
	    long min=0;
	    long max=n;
	    for(int i=0;i<m;i++) {
	    	if( lr[i][0] > min ) min = lr[i][0];
	    	if( lr[i][1] < max ) max = lr[i][1];
	    }

	    System.out.println((min<=max)? max-min+1:"0");

	}

}
