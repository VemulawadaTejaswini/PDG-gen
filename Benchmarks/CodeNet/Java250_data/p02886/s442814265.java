import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < i; j++){
				sum += a[i] * a[j];
			}
		}
		System.out.print(sum);
	}

}
