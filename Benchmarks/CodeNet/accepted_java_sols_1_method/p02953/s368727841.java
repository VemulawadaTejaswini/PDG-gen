import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<Long> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}

		long prevH = list.get(n-1);
		boolean isSuccess = true;
		for (int i = n-1; i > 0; i--) {
			long currentH = list.get(i-1);
			// System.out.println("currentH " + currentH);
			// System.out.println("prevH " + prevH);

			if(currentH -  prevH > 1){
				isSuccess = false;
				break;
			}

			if(currentH -  prevH ==1){
				currentH--;
			}
			prevH = currentH;
		}

		System.out.print(isSuccess?"Yes":"No");
			
	}

}
