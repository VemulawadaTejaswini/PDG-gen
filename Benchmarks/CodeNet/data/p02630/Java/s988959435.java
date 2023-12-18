import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		Map<Integer,Integer> a = new TreeMap<>();
		for(int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			if(a.containsKey(temp)) {
				a.put(temp, a.get(temp)+1);
			}
			else {
				a.put(temp,1);
			}
			sum += temp;
		}
		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a.containsKey(b)) {
			int temp = a.get(b);
			sum += (c-b)*temp;
			a.put(b,0);
			
			if(a.containsKey(c)) {
				a.put(c,a.get(c)+temp);
			}
			else {
				a.put(c,temp);
			}
			}
			System.out.println(sum);
		}
	}
}