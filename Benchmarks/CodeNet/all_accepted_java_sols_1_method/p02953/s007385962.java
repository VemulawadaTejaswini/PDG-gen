import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 地点数の入力
		int n = sc.nextInt();

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			list.add(sc.nextInt());
		}

		for (int i = 0; i < n-1; i++) {
			int before = list.get(i);
			int after  = list.get(i+1);
			//System.out.println(before + " " + after);
			if (before==after) {
              //System.out.println("bef=after");
              continue;
            }
			if (before<=after-1) {
                //System.out.println("minus1");
				list.set(i+1, after-1);
				continue;
			} else {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");

	}}