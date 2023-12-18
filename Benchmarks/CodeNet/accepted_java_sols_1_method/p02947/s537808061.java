import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] a = new String[N];
		long sum= 0;
		HashMap<String,Long> map = new HashMap<String,Long>();
		for(int i = 0;i<N;i++) {
			a[i]=sc.next();
	        char []chars =a[i].toCharArray();
	        Arrays.sort(chars);
	        String sorted = new String(chars);

			if(map.containsKey(sorted)) {;
				sum+=map.get(sorted);
				map.put(sorted, map.get(sorted)+1);
			}
			else {
				map.put(sorted,1L);
			}
		}
		System.out.print(sum);
		}
}
