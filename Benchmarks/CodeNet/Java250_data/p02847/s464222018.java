import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s[] = {"SUN","MON","TUE","WED","THU","FRI","SAT" };
		String temp = sc.next();
		for (int i=0;i<s.length;i++) {
			if (temp.equals(s[i])==true) {
				System.out.println(7-i);
				return ;
			}
		}
	}
}