import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<String> set = new HashSet<String>();
		String temp ="";
		for (int i=0;i<N;i++) {
			String s = sc.next();
			if (temp.equals("")==false&&s.charAt(0)!=temp.charAt(temp.length()-1)) {
				System.out.println("No");
				return ;
			}
			if (set.contains(s)) {
				System.out.println("No");
				return ;
			}
			set.add(s);
			temp = s;
		}
		System.out.println("Yes");
	}
}