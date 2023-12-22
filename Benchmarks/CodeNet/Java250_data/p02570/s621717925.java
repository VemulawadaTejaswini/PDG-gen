import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int d = s.nextInt();
		int t = s.nextInt();
		int ss = s.nextInt();
		
		if(Math.ceil((double)d / (double)ss) <= t)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}