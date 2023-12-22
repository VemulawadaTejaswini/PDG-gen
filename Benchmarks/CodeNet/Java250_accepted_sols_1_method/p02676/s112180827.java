import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String s=scan.next().toLowerCase();
		int k=s.length();
		if(n>=k)System.out.println(s);
		else {
			String ss=s.substring(0, n);
			System.out.println(ss+"...");
		}
		
	}

}
