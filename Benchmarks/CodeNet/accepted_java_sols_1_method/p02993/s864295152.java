import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String S=scan.next();
		char[] y=S.toCharArray();
		if(y[0]==y[1] || y[1]==y[2] || y[2]==y[3])
		{
			System.out.println("Bad");
		}
		else {
			System.out.println("Good");
		}

	}

}