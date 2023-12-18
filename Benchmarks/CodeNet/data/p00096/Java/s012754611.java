import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		ArrayList<String> innstr = new ArrayList<String>();
		while(sc.hasNextInt()) {
			innstr.add(sc.next());
//			System.out.println(sumof4alg1(sc.nextInt()));
		}
		
		int[] inn = new int[innstr.size()];
		for(int i = 0; i < innstr.size(); i++) {
			inn[i] = Integer.parseInt(innstr.get(i));
		}
		
		for(int i = 0; i < inn.length; i++) {
			System.out.println(sumof4alg1(inn[i]));
		}
		
		
	}

	//kをすべて試す方法
	static long sumof4alg1(int n) {
		long result = 0;
		for(int k = 0; k <= n; k++) {
			result += (k + 1) * (n - k + 1);
		}
		
		
		return result;
	}
	
}