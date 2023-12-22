import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] x = new int[n];
		int[] sort = new int[n];
		for(int i=0;i<n;i++) {
			x[i] = in.nextInt();
			sort[i] = x[i];
			
		}
		Arrays.sort(sort);
		int low = sort[n/2-1];
		int high = sort[n/2];
		for(int i=0;i<n;i++) {
			if(x[i]<=low) System.out.println(high);
			else System.out.println(low);
		}
		
		in.close();

	}

}
