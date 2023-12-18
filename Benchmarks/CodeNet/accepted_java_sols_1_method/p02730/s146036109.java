import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String s=scan.nextLine();
		int n=s.length();	
		StringBuilder s1=new StringBuilder(s.substring(0, (n-1)/2));
		StringBuilder s2=new StringBuilder(s.substring((n+1)/2,n));
		StringBuilder s3=new StringBuilder(s);
		s1.reverse();
		s2.reverse();
		s3.reverse();
		if(s.contains(s3) && s.substring(0, (n-1)/2).contains(s1) && s.substring((n+2)/2,n).contains(s2)) {
			System.out.println("Yes");
		}
		else System.out.println("No");
	}

}
