import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Set<String> dic = new HashSet<String>();
		
		int n = Integer.parseInt(in.nextLine());
		for (int i = 0; i < n; i++) {
			String str = in.nextLine();
			String ele[] = str.split(" ");
			if (ele[0].equals("insert")) {
				dic.add(ele[1]);
			} else {
				if (dic.contains(ele[1])) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}
}

