import java.util.Arrays;
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
		Arrays.sort(a);
		int cnt = 0;
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				for(int k = j+1; k < n; k++){
					if(a[k] < a[i] + a[j]){
						cnt++;
					}
				}
			}
		}
		System.out.print(cnt);
	}

}