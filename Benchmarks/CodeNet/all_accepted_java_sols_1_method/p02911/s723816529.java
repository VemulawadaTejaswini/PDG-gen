import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int q = scan.nextInt();

		int[] a = new int[n + 1];
		int i;
		for(i = 0; i < q; i++)
			a[scan.nextInt()]++;

		int border = q - k;
		for(i = 1; i <= n; i++) {
			if(a[i] > border) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}
