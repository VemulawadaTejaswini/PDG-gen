import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.length()%2==1) {
			System.out.println("No");
			return ;
		}
		for (int i=0;i<s.length();i=i+2) {
			if (!"hi".equals(s.substring(i, i+2))) {
				System.out.println("No");
				return ;
			}
		}
		System.out.println("Yes");
	}
}
