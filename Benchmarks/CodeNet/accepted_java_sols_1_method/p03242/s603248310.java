import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		System.out.println(s.replace('9','o').replace('1', '9').replace('o', '1'));
	}
}
