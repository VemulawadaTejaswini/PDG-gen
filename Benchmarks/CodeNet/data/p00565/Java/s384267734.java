import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] a = new int[N];

		for(int i=0;i<N;i++) a[i] = sc.nextInt();

		int max = 0;

		int n = 0;

		for(int i=0;i<N;i++) {

			if(a[i] == 0) n = 0;

			else n++;

			if(max<n) max = n;

		}

		System.out.println(max+1);

	}

}

