import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		ArrayList<Integer> lifeList = new ArrayList<>();
		long ans = 0;
		
		for(int i = 0; i < N; i++) {
			lifeList.add(sc.nextInt());
		}

		lifeList.sort(Comparator.reverseOrder());
		int attackTimes = Math.min(K, N); 
		
		for(int i = attackTimes; i < lifeList.size(); i++) {
			ans += lifeList.get(i);
		}

		System.out.println(ans);
		sc.close();
	}
	
}