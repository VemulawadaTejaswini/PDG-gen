import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		HashSet<String> set = new HashSet<>();
		for(int i = 0; i < count; i++) {
			String num = sc.next();
			if(set.contains(num)) set.remove(num);
			else set.add(num);
		}

		System.out.println(set.size());

	}
}
