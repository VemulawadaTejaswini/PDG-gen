import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt() * 2;
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}

		Collections.sort(list);
		int plusNum = 0,result = 0;
		if(list.size() % 2 != 0) plusNum += 1;
		for(int i = 0; i < list.size() / 2; i++) {
			result += list.get((i * 2) + plusNum);
		}
		System.out.println(result);
	}
}
