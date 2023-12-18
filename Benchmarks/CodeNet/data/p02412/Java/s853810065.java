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
			ArrayList<ArrayList<Integer>> duplications = new ArrayList<>();

			for(int i=1; i<=n; i++) {
				// 条件に合う組み合わせを数える
				for(int j=1; j<=n; j++) {
//					if(duplications.indexOf(j) != -1) continue;
					if(j==i) continue;
					for(int y=1; y<=n; y++) {
//						if(duplications.indexOf(y) != -1) continue;
						if(y == j || y == i) continue;
//						System.out.println(i + ", " + j + ", " + y);
						if((i+j+y) == x) {
							// 重複チェック
							Boolean breakFlag = false;
							for(ArrayList<Integer> dup : duplications) {
								if(dup.indexOf(i) != -1 && dup.indexOf(j) != -1 && dup.indexOf(y) != -1) {
//									System.out.println("重複!! : " + i + ", " + j + ", " + y);
									breakFlag = true;
									break;
								}
								if(breakFlag) break;
							}
							if(!breakFlag) {
//								System.out.println(i + ", " + j + ", " + y);
								count++;
								ArrayList<Integer> dup = new ArrayList<>();
								dup.add(i);
								dup.add(j);
								dup.add(y);
								duplications.add(dup);
							}
						}
					}
				}
			}

			System.out.println(count);
		}

		sc.close();

	}

}

