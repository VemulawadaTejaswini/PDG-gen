import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		while(true) {
			int num = s.length()%2!=0 ? 1:2;
			s = s.substring(0, s.length()-num);
			if(s.substring(0,s.length()/2).equals(s.substring(s.length()/2))) {
				break;
			}
		}
		System.out.println(s.length());
	}
}
