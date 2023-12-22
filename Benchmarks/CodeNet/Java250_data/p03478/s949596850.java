import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static Integer sum(ArrayList<Integer> M) {
		int sum = 0;
		for(int i = 0; i < M.size(); i++) {
			sum += (int)M.get(i);
		}
		return(sum);
	}

	public static void main(String[] args) {
		int A,B,N;
		int s = 0;
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		A = scan.nextInt();
		B = scan.nextInt();
		ArrayList<Integer> M = new ArrayList<Integer>();

		for(int i = 1; i <= N; i++) {
			String str = String.valueOf(i);
			for(int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				int k = Character.getNumericValue(ch);
				M.add(k);
			}
			if(A <= sum(M) && sum(M) <= B) {
				s += i;
			}
			M.clear();
		}
		System.out.println(s);
		scan.close();
	}
}
