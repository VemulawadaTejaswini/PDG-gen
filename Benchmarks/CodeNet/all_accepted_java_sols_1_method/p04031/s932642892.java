
import java.util.Arrays;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];;
		int tmp = 0;
		int ans = 0;

		
		for (int i=0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		for (int i = a[0]; i <= a[a.length-1]; i++) {
			tmp = 0;
			
			for (int j = 0; j < N; j++){
				tmp += (a[j] - i) * (a[j] - i);
			}
			

			if (i == a[0]){
				ans = tmp;
			}else {
				if (ans > tmp) ans = tmp;
			}
		}
		
		

		System.out.println(ans);
		sc.close();
	}

}
