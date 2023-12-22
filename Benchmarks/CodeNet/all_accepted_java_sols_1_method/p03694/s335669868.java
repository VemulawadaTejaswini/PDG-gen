import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int min = 0;
		int N = scan.nextInt();
		int a[] = new int [N];
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}
		max = a[0];
		min = a[0];
		for(int k = 1; k < N; k++) {
			if(max < a[k]) max = a[k];
			if(min > a[k]) min = a[k];
		}
		System.out.println(max - min);
		scan.close();
	}
}