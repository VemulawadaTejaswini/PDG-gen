import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];

		int i;
		for(i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for(i = 0; i < n; i++) {
			if(a[i] % 2 == 0) {
				if(!(a[i] % 3 == 0 || a[i] % 5 == 0)) {
					System.out.println("DENIED");
					return;
				}
			}
		}
		System.out.println("APPROVED");
	}
}