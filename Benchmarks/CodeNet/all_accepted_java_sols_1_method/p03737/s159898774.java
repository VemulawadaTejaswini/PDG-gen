import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner cin = new Scanner(System.in);
		String s1 = String.valueOf(cin.next().charAt(0)).toUpperCase();
		String s2 = String.valueOf(cin.next().charAt(0)).toUpperCase();
		String s3 = String.valueOf(cin.next().charAt(0)).toUpperCase();

		System.out.println(s1+s2+s3);
	}
}
