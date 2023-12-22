import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> hList = new ArrayList<>();

		long cnt = 0;

		for(int i=0;i<n;i++) {
			hList.add(sc.nextInt());
		}

		Collections.sort(hList);

		//n>kの場合
		if(n>k) {
			for(int i=0;i<(n-k);i++) {
				cnt += hList.get(i);
			}
		}else {
			cnt = 0;
		}


		System.out.println(cnt);

	}
}
