import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    long t = scan.nextLong();
	    long nt[]=new long[n+1];
	    nt[0]=0;
	    for(int i=1;i<=n;i++) {
	    	nt[i]=scan.nextLong();
	    }
	    scan.close();
	    long x=0;
	    for(int i=1;i<=n;i++) {
	    	x+=Math.min(t, nt[i]-nt[i-1]);
	    }
	    System.out.println(x+t);
	}

}