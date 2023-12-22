
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		double s = 0;
		
		for(int i = 0; i < n ; i ++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < n; j ++) {
			s += Math.sqrt( (a[i] - a[j])*(a[i] - a[j]) +(b[i] - b[j])*(b[i] - b[j]) );
				
			}
		}
		System.out.println(s/n);
		
		// TODO 自動生成されたメソッド・スタブ

	}

}