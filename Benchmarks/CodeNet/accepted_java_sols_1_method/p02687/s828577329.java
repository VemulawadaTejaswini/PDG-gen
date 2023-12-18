import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.next();

		String result = "ARC";
		if(n.equals("ARC")) {
			result = "ABC";
		}

		System.out.println(result);
	}
}