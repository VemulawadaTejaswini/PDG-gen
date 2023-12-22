import java.util.Scanner;

//public class atcoder0221_A{
public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String N = scan.next();
		String result = "No";
		if(N.matches(".*A.*") && N.matches(".*B.*")) {
			result ="Yes";
		}
		System.out.println(result);
	}
}