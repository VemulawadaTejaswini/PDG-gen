import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(Range(a,b,c));
	}
	
	public static String Range(int a, int b, int c){
		String word;
		word = (a < b && b < c) ? "Yes" : "No";
		return word;
	}

}