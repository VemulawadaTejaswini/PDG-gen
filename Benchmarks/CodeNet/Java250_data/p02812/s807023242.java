import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			
			String s = sc.next();
			
			String sr = s.replaceAll("ABC", "");
			
			int count = (n - sr.length()) / 3;
			
			System.out.println(count);
		}
	}
}