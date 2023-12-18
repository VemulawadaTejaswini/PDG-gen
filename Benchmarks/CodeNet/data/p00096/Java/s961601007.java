import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		ArrayList<String> innstr = new ArrayList<String>();
		while(sc.hasNextInt()) {
			innstr.add(sc.next());
		}
		
		int[] inn = new int[innstr.size()];
		for(int i = 0; i < innstr.size(); i++) {
			inn[i] = Integer.parseInt(innstr.get(i));
		}
		
		for(int i = 0; i < inn.length; i++) {
			System.out.println(sumof4alg1(inn[i]));
		}
		
	}

	//kテ」ツつ津」ツ?凖」ツ?ケテ」ツ?ヲティツゥツヲテ」ツ?凖ヲツ鳴ケテヲツウツ?
	static int sumof4alg1(int n) {
		int result = 0;
		for(int k = 0; k <= n; k++) {
			result += (k + 1) * (n - k + 1);
		}
		
		
		return result;
	}
	
}