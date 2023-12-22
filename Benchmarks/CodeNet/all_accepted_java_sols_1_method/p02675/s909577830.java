import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		int n=s.length();
		if(s.charAt(n-1)=='6' || s.charAt(n-1)=='0'|| s.charAt(n-1)=='1' || s.charAt(n-1)=='8') System.out.println("pon");
		else if(s.charAt(n-1)=='3') System.out.println("bon");
		else System.out.println("hon");
		
	}

}
