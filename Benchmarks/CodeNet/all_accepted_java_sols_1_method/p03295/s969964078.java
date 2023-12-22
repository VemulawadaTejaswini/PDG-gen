import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("unused")
		int N = sc.nextInt();
		int M = sc.nextInt();

		//int[] aを入れるリスト
		List<int[]> list = new ArrayList<>();

		for(int i = 0; i < M; i++) {
			int[] a = new int[2];
			a[0] = sc.nextInt();
			a[1] = sc.nextInt();
			list.add(a);
		}

		list.sort((a1,a2)->a1[1]-a2[1]);
		int count = 0,  latest = 0;
		for(int[]a:list) {
			//System.out.println(a[0]+":"+a[1]);
			if(a[0]<=latest && latest<a[1]) {
				//条件に一致したら次の繰り返し処理に飛ばす
				continue;
			}
			latest = a[1]-1;
			//System.out.println(latest);
			count++;
		}
		System.out.println(count);
		sc.close();
	}

}