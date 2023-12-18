import java.util.*;

public class Main {

	public static void main(String[] args) {
		int n;
		int[] a = new int[20000];
		Scanner stdIn = new Scanner(System.in);
		n = stdIn.nextInt();
		while (n!=0){
			double sum=0.0;
			for (int i=0;i<n;i++){
				a[i] = stdIn.nextInt();
				sum+=a[i];
			}
			double ave=sum/n;
			int count=0;
			for (int i=0;i<n;i++) {
				if (a[i]<=ave) {
					count++;
				}
			}
			System.out.println(count);
			n = stdIn.nextInt();
		}

	}

}

