import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		String abc = "abcdefghijklmnopqrstuvwxyz";
		int index = abc.indexOf(c);
		System.out.println(abc.charAt(index+1));
		}
	}


