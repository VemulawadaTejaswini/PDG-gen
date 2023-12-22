import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int x = scan.nextInt();
	    int a[]=new int[n];
	    int sum=0;
	    for(int i=0;i<n;i++) {
	    	a[i]=scan.nextInt();
	    	sum+=a[i];
	    }
	    scan.close();

	    Arrays.sort(a);

	    System.out.println(n+(x-sum)/a[0]);
	}

}
