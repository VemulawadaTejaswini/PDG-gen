import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>(n);
		List<Integer> sortedList = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(sc.next());
			list.add(a);
			sortedList.add(a);
		}
		Collections.sort(sortedList);

		// System.out.println(sortedList);

		int prevP =0;
		int count =0;
		for (int i = 0; i < n; i++) {
			int currentP = list.get(i);
			int currentPSorted = sortedList.get(i);
			// System.out.println(currentP);
			// System.out.println(currentPSorted);

			if(currentP == currentPSorted){

			}else{
				count++;
			}
		}
		
		// System.out.println(count);


			System.out.println(count <= 2 ? "YES" : "NO" );

	}



}
