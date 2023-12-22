import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int ans = 0;
		int N = sc.nextInt();
		int X = sc.nextInt();
		List<Integer> donuts = new ArrayList<Integer>();

		for(int i=0;i<N;i++) {
			donuts.add(sc.nextInt());
		}
		Collections.sort(donuts, null);
		for(int j=0;j<N;j++) {
		if(X-donuts.get(j)>=0) {
			X=X-donuts.get(j);
			ans +=1;
		}

		}

		while(X-donuts.get(0)>=0) {
			X=X-donuts.get(0);
			ans +=1;
		}
		System.out.println(ans);
}
}