import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int h[]= new int[n];
	    for(int i=0;i<n;i++) {
	    	h[i]=scan.nextInt();
	    }
	    scan.close();
	    int cnt=0;
	    int max=0;
	    for(int i=n-2;i>=0;i--) {
	    	if(h[i+1]<=h[i])cnt++;
	    	else cnt=0;
	    	if(cnt>max)max=cnt;
	    }

	    System.out.println(max);

	}

}
