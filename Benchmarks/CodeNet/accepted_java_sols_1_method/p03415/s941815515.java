import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//A
		String[] s = new String[3];
		s[0] = sc.next();
		s[1] = sc.next();
		s[2] = sc.next();
		System.out.println(s[0].charAt(0)+""+s[1].charAt(1)+""+s[2].charAt(2));
	}
}
