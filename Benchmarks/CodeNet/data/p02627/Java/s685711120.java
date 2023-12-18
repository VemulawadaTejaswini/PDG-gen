import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(0)>='A' && s.charAt(0)<='Z') c=1;
		}
		if(c==1) System.out.println("A");
		else System.out.println("a");

	}

}
