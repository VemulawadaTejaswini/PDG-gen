import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int    N = scan.nextInt();
		String S = scan.next();
		String T = scan.next();
		List <String> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(String.valueOf(S.charAt(i)));
			list.add(String.valueOf(T.charAt(i)));
		}
		for (int i=0; i <  list.size(); ++i)
		{
		    System.out.print(list.get(i));
		}
	}
}
