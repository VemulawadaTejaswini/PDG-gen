import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++)
			list.add(sc.nextInt());
		Collections.sort(list);
		for(int i = 0; i < k; i++)
			sum += list.get(i);
		System.out.println(sum);
	}
}
