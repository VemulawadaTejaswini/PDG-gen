import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] length = new int[n];
		int sum=0;

		for(int i=0;i<n;i++) {
			length[i]=sc.nextInt();
		}

		Arrays.sort(length);

		for(int i=0;i<n-1;i++) {
			sum+=length[i];
		}

		System.out.println(length[n-1]<sum?"Yes":"No");

	}
}