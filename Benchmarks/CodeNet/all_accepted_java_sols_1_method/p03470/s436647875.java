import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//何枚持っているか
		int N =sc.nextInt();
		//各餅の直径
		int d[] = new int[N];
		for(int i = 0;i < N;i++) {
			d[i] = sc.nextInt();
		}
		//大きい順に並び替え
		int max;
		for(int i = 0;i < N;i++) {
			for(int j = i;j < N;j++) {
				if(d[i] < d[j]) {
					max = d[i];
					d[i] = d[j];
					d[j] = max;
				}
			}
		}
		//何段重ねにできるか(一段は確実にできる)
		int count = 1;
		//大きさの比較
		int mochi = d[0];
		for(int i = 1;i < N;i++) {
			if(mochi > d[i]) {
				mochi = d[i];
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}