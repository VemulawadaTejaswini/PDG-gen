import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int[] point = new int[n];
		for(int i = 0; i < n; i++) {
			point[i] = k;
		}
		for(int i = 0; i < q; i++) {
			int a = sc.nextInt();
			point[a-1] += 1;
		}
		for(int i = 0; i < n; i++) {
			if(point[i]-q <= 0)System.out.println("No");
			else System.out.println("Yes");
		}
		sc.close();
	}

}