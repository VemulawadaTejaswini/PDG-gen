import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int count = 0;
		
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		
		for(int i=0;i<n;) {
			if(a[i] % 2 == 1) {
				count++;
			}
			i += 2;
		}
		System.out.println(count);

	}

}
