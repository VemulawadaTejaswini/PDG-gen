import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[n];


		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}

		int x = 0;

		for(int i=0;i<a.length;i++) {

			while(a[i]%2==0) {
				if(a[i] % 2 ==0) {
					a[i] /= 2;
					x++;
				}
			}
		}

		System.out.println(x);
	}
}
