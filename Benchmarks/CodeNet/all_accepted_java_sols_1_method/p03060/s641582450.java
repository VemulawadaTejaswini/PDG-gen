import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<Integer> nList = new ArrayList<>();

		int total = 0;
		for (int i = 0; i < n; i++) {
			nList.add(sc.nextInt());
		}
		for (int i = 0; i < n; i++) {
			int cost = sc.nextInt();
			int currentValue = nList.get(i);

			if(currentValue>cost){
				total += currentValue - cost;
			}
		}

		System.out.println(total);


	}
}
