import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] oisisa = new int[n];
		int sum = 0;
		for(int i = 0;i < n; i++) {
			oisisa[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j) {
					continue;
				}
				sum += oisisa[i] * oisisa[j];
			}
		}
		System.out.println(sum/2);
	}
}