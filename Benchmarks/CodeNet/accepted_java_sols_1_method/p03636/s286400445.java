import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		System.out.print(s[0]);
		System.out.print(s.length-2);
		System.out.print(s[s.length-1]);

	}

}