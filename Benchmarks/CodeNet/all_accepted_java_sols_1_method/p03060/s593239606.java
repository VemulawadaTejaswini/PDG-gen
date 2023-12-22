
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());//int型
		int[] v = new int[N];//int型
		int[] c = new int[N];//int型
		for(int i = 0; i < N; i++) {
			v[i] = Integer.parseInt(sc.next());
		}
		for(int i = 0; i < N; i++) {
			c[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		
		int ans = 0;
		for(int i = 0; i <N; i++) {
			if(v[i]>c[i]){
				ans += v[i]-c[i];
			}
		}
		System.out.println(ans);
	}

}
