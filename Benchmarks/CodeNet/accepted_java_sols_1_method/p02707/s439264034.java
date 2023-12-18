import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] count = new int[n+1];
		
		for(int i=1;i<n;i++) {
			a[i] = scan.nextInt();
			count[a[i]]++;
		}
		
		for(int i=1;i<n+1;i++) {
			System.out.println(count[i]);
		}

	}

}
