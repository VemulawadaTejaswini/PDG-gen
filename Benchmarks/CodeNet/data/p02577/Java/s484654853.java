import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String N = sc.nextLine();
		char[] ch = N.toCharArray();
		
		int sum = 0;
		for(int i=0; i<ch.length; i++)
			sum += (ch[i] - '0');
		
		if(sum % 9 == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}

}