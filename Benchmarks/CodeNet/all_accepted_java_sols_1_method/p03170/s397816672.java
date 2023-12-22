
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=sc.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		boolean[] first = new boolean[k+1];
		for (int i=0;i<k;i++) {
			if (!first[i]) {
				for (int j=0;j<n;j++) {
					if(i+a[j]<=k) {
						first[i+a[j]]=true;
					}
				}
			}
		}

		
		System.out.println(first[k] ? "First" : "Second");
	}

}
