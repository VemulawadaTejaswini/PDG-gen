import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[]= new long[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextLong();
		}
		Map<Long,Integer> map = new HashMap<Long,Integer>();
		for (int i=0;i<N;i++) {
			long temp = (i+1+A[i])*-1;
			if (map.containsKey(temp)) {
				Integer in = map.get(temp);
				in++;
				map.put(temp, in);
			} else {
				map.put(temp, 1);
			}
		}
		long result=0;
		for (int i=0;i<N;i++) {
			long temp = A[i]-i-1;
			if (map.containsKey(temp)) {
				int count = map.get(temp);
				if (A[i]==0) {
					count--;
				}
				result +=count;
			}
		}
		System.out.println(result);
	}
}