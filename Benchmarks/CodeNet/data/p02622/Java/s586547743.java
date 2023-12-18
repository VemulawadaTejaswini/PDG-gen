import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();		
		//long n = sc.nextLong();
		//double n = sc.nextDouble();
		int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=t.charAt(i)) {
				sum++;
			}
		}

		//System.out.println("Yes");
		System.out.println(sum);
	

	}
}

