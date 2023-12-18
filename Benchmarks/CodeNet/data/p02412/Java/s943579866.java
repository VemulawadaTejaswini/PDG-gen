import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			int n = sc.nextInt();
			int x = sc.nextInt();

			if(n == 0 && x == 0) break;

			int count = 0;
			// 重複リスト
			ArrayList<Integer> duplications = new ArrayList<>();

			for(int i=1; i<=n; i++) {
				// 条件に合う組み合わせを数える
				duplications.add(i);
				for(int j=1; j<=n; j++) {
					if(duplications.indexOf(j) != -1) continue;
					for(int y=1; y<=n; y++) {
						if(duplications.indexOf(y) != -1) continue;
						if((i+j+y) == x) {
							count++;
							duplications.add(i);
							duplications.add(j);
							duplications.add(y);
						}
					}
				}
			}

			System.out.println(count);
		}

		sc.close();

	}

}

