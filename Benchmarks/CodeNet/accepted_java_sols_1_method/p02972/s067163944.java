import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(sc.next());
			list.add(a);
		}

		int[] result = new int[n];
		int resultCount =0;
		for (int i = n-1; i >= 0; i--) {
			int a = list.get(i);

			int count = 0;
			// System.out.println("a " + a);

			for (int j = 1; j * (i+1) <= n; j++) {
				// System.out.println("(i+1)* j " + (i+1)* j );
				count += result[j * (i+1) - 1];
			}

			if(count % 2 == a){
				result[i] = 0;
			}else{
				result[i] = 1;
				resultCount++;
			}

		}
			// System.out.println(Arrays.toString(result));

		System.out.println(resultCount);
		for (int i = 0; i < n; i++) {
			if(result[i] == 1){
				System.out.print(i+1);
				System.out.print(" ");

			}
		}





	}

}
