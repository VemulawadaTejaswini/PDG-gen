import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		HashMap<Integer, Integer> remMap = new HashMap<>();

		int bef=0;
		int modsum;
		for (int i=0; i<n; i++){
			int a = scanner.nextInt();
			modsum = (bef+a)%m;
			remMap.put(modsum, remMap.getOrDefault(modsum,0)+1);
			bef = modsum;
		}

		long ans = remMap.getOrDefault(0, 0);
		for (int rem: remMap.values()){
			if (rem<=1) continue;
			ans += rem*(rem-1L)/2;
		}
		System.out.println(ans);
	}
}