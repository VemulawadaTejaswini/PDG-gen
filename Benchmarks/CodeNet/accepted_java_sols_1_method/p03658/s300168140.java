import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		Integer[] l = new Integer[n];
		for(int i=0;i<n;i++) {
			l[i]=scan.nextInt();
		}
		Arrays.sort(l, Collections.reverseOrder());
		int sum=0;
		for(int i=0;i<k;i++) {
			sum=sum + l[i];
		}
		System.out.println(sum);
	}

}
