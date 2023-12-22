import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		double sum = 0;
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		double avg = (double)a[0];
		for(int i = 1; i < n; i++){
			avg = (double)(avg + a[i]) / 2.0;
		}
		System.out.println(avg);
	}


}
