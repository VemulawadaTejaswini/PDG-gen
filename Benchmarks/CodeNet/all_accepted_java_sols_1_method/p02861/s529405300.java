import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][2];
		for (int i = 0; i < n; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		double sum = 0;
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j != i) {
					sum += Math.sqrt((a[i][0]-a[j][0])*(a[i][0]-a[j][0])+(a[i][1]-a[j][1])*(a[i][1]-a[j][1]));
				}
			}
		}
		System.out.println(sum/n);
		sc.close();
	}
}