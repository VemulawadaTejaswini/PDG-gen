import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k  = sc.nextInt();
		int count = 0;
		Map<Integer,Integer> p =  new LinkedHashMap<Integer,Integer>();

		for(int i = 1; i <= n; i++) {
			p.put(i,0);
		}

		for(int i = 0; i < k; i++) {
			int d = sc.nextInt();
			for(int j = 0; j < d; j++) {
				int a = sc.nextInt();
				int temp = p.get(a)+1;
				p.put(a,temp);
			}
		}

		for(int i:p.keySet()) {
			if(p.get(i) == 0) {
				count++;
			}
		}
		System.out.println(count);


	}

}