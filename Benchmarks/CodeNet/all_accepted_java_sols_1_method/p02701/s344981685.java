import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int N = Integer.parseInt(stdIn.nextLine());
		String[] S = new String[N];
		for(int i = 0; i < N; i ++) {
			S[i] = stdIn.nextLine();
		}
		HashMap<String, Integer> itemNum = new HashMap<String, Integer>();
		for(int i = 0; i < S.length; i ++) {
			if(itemNum.get(S[i]) == null) {
				itemNum.put(S[i], 1);
			}
		}
		System.out.println(itemNum.size());
	}
}