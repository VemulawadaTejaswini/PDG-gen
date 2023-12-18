import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if(c=='A') System.out.println('T');
		if(c=='T') System.out.println('A');
		if(c=='C') System.out.println('G');
		if(c=='G') System.out.println('C');
	}
}
