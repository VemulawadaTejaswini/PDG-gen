import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String S[] = scan.nextLine().split(" ");
		String s = S[1].substring(0, 1);
		System.out.println("A"+s+"C");
		scan.close();
	}
}
