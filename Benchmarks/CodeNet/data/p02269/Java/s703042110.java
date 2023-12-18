
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();				//入力数
		Set<String> Dic = new HashSet<>();
		for (int i = 0; i < N; i++) {
			String Command = scan.next();
			String str = scan.next();
			if (Command.equals("insert")) {
				Dic.add(str);
			} else {
				if (Dic.contains(str)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
		scan.close();
	}
}


