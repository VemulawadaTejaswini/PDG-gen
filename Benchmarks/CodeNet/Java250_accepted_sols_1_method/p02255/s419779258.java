import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);
//		Scanner sc = new Scanner(new File("test_1.txt"));
		List<Integer> a = new ArrayList<Integer>();
		int N = sc.nextInt();
		for (int i = 0; i < N; i++)
			a.add(sc.nextInt());
		sc.close();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			// 0..i-1??????????????????
			int a_i = a.get(i);
			int j = i - 1;
			while (j >= 0 && a.get(j) > a_i) {
				a.set(j + 1, a.get(j));
				j--;
			}
			a.set(j + 1, a_i);
			
			// ??????
			for (int k = 0; k < a.size(); k++) {
				sb.append(a.get(k));
				if (k != a.size() - 1)
					sb.append(' ');
			}
			sb.append('\n');
		}
		
		System.out.print(sb.toString());
	}
}