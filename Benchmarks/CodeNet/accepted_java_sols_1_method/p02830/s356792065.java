
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		String a=sc.next();
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
			System.out.print(a.charAt(i));
		}
		System.out.println();

	}

}
