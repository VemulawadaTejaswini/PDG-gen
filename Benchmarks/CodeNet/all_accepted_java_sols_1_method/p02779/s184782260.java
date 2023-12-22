import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		HashSet<Long> list = new HashSet<Long>();
		boolean check = true;
		long in = 0;

		for(int i = 0;i < n;i++) {
			in = scan.nextLong();
			if(list.contains(in)) {
				check = false;
			}
			list.add(in);
		}

		if(!check) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}
}