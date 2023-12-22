import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		int ans=700;
		if(s.charAt(0)=='o') ans+=100;
		if(s.charAt(1)=='o') ans+=100;
		if(s.charAt(2)=='o') ans+=100;
		System.out.println(ans);
	}


}
