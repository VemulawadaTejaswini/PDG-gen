import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		ArrayList<String> strList = new ArrayList<String>();

		for(int i = 0; i < N; i++) {
			strList.add(sc.next());
		}

		List<String> listB = new ArrayList<String>(new HashSet<>(strList));

		System.out.println(listB.size());
	}
}
