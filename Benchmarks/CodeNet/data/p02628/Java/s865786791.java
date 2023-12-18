import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> priceList = new ArrayList<>();
		int ans = 0;
		
		for(int i = 0; i < n; i++) {
			priceList.add(sc.nextInt());
		}
		Collections.sort(priceList);
		
		for(int i = 0; i < k; i++) {
			ans += priceList.get(i);
		}
		System.out.println(ans);
		sc.close();
	}

}