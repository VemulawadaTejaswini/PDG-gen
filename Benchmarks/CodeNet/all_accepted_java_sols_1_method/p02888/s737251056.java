import java.util.Arrays;
import java.util.Scanner;

// https://atcoder.jp/contests/abc143/tasks/abc143_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

//		List<Integer> list = new ArrayList<Integer>();
//		for(int i=0;i<N;i++) {
//			list.add(sc.nextInt());
//		}

		int[] array = new int[N];
		for(int i=0;i<N;i++) {
			array[i]=sc.nextInt();
		}

		sc.close();

		Arrays.sort(array);
		int result = 0;

		for(int i=0;i<N;i++) {
//			int a = list.get(i);
			for(int j=i+1;j<N;j++) {
//				int b = list.get(j);
				for(int l=j+1;l<N;l++) {
//					int c = list.get(l);
					if((array[l]<array[i]+array[j])) {
						result++;
					}else {
						break;
					}
				}
			}
		}
		System.out.println(result);
	}
}
