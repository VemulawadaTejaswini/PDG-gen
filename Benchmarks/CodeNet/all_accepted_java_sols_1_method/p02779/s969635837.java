import java.util.HashMap;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String anser = "YES";
 
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
 
		int A = 0;
		for (int i = 0; i < N; i++) {
			A = scan.nextInt();
 
			if (map.containsKey(A)) {
				anser = "NO";
				break;
			} else {
				map.put(A, i);
			}
		}
 
		System.out.println(anser);
	}
 
}