import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int n,i;
		int sum=0;
		double ave,syg,bsum=0;
		int[] data;
		data = new int[1000];
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			bsum = 0;
			sum = 0;
			n=sc.nextInt();
			if (n==0) {
				break;
			}
			for (i=0 ; i<n ; i++) {
				data[i]=sc.nextInt();
				sum += data[i];
			}
			ave = (double)sum/(double)n;
			for (i=0 ; i<n ; i++) {
				bsum += ((double)data[i]-ave)*((double)data[i]-ave);
			}
			syg = Math.sqrt((double)bsum/(double)n);
			System.out.println(""+syg);
		}
		
		sc.close();
	}	
}
