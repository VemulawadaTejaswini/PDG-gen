import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); //n人の参加者
		int k = stdIn.nextInt(); //所持ポイント数※10^9の範囲であるためlongを使うべきかも
		int q = stdIn.nextInt(); //q個の問題
		int[] a = new int[n]; 
		
		for(int i = 0; i < n; i++) {
			a[i] = k-q;
		}
		
		for(int i = 0; i < q; i++) {
			int seikaisya = stdIn.nextInt()-1;
			a[seikaisya]++;
		}
		
		for(int i = 0; i < n; i++) {
			if(a[i]<=0) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}





	}

}
