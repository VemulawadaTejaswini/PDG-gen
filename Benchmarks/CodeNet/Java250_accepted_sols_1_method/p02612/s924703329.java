import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//int n = sc.nextInt();
		String s = sc.next();
		
		if(s.length() <= 3) {
			int n = Integer.parseInt(s);
			System.out.println(1000-n);
			return;
		}
		
		s = s.substring(s.length()-3);
		
		int n = Integer.parseInt(s);
		
		if(n == 0) {
			System.out.println(0);
			return;
		}
		//long n = sc.nextLong();
		//double n = sc.nextDouble();
		
		System.out.println(1000 - n);
		//for(int i = 0; i < ; i++)

		//System.out.println("Yes");
		//System.out.println("No");
		

	}
}
