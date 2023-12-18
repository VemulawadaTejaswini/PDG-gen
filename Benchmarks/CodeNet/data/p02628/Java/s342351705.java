import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int sum = 0;
		int [] nlist = new int[n];
		for(int i=0; i<n; i++) {
			nlist[i] = sc.nextInt();
		}
		Arrays.sort(nlist);
			for(int i=0; i<k; i++) {
				sum += nlist[i];
			}
			System.out.println(sum);
		}
	

}
