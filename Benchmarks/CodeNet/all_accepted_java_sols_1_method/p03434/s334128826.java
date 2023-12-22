import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		scan.close();
		Arrays.sort(a);
		int alice=0,bob=0,check=0;
		for(int i=n-1;i>=0;i--) {
			if(check%2==0)alice+=a[i];
			else bob+=a[i];
			check++;
		}
		System.out.println(alice-bob);
	}

}