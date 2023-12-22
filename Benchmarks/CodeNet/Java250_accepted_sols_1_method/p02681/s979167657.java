import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String d=scan.next().toLowerCase();
		String s=scan.next().toLowerCase();
		String c=s.substring(0, s.length()-1);
		if(d.equalsIgnoreCase(c)==true) {
			System.out.println("Yes");
		}
		else System.out.println("No");
		
		
	}

}
