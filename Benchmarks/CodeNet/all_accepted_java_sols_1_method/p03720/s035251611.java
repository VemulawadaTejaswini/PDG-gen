import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];

		for(int i=0;i<m;i++) {
			a[i]=scan.nextInt();
			b[i]=scan.nextInt();
		}
		int[] count = new int[n];
		for(int i=1;i<n+1;i++) {
			//都市iが配列a,bの中に何回登場するかカウントすればよい
			for(int l=0;l<m;l++) {
				if(a[l]==i) {
					count[i-1]++;
				}
				if(b[l]==i) {
					count[i-1]++;
				}
			}
		}

		for(int i=0;i<n;i++) {
			System.out.println(count[i]);
		}
	}

}
