import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());
		
		String s = sc.next();
		
		int[] i = new int[n];
		
		int account = 0;
		
		for(int j = 1; j < s.length(); j++) {
			if(s.charAt(j-1) == 'A') {
				if(s.charAt(j) == 'C') {
					account++;
				}
			}
			i[j] = account;
		}
		
		List<Integer> res = new ArrayList<Integer>();
		
		for(int j = 0; j < q; j++) {
			int start = Integer.parseInt(sc.next());
			int end = Integer.parseInt(sc.next());

			res.add(i[end-1] - i[start-1]);
		}
		
		for(int j : res) {
			System.out.println(j);
		}
		
	}
}