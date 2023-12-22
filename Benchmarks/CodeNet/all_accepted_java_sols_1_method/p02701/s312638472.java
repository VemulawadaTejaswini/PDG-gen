import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args){
		Set<String> lottery = new LinkedHashSet<String>();
		Scanner scan = new Scanner(System.in);

		int N = Integer.parseInt(scan.nextLine());

		for(int i = 0; i < N; i++){
			String S = scan.nextLine();
			lottery.add(S);
		}

		System.out.println(lottery.size());
	}
}
