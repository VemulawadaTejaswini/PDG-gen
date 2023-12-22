import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		int z = 0;
		int x = 0;
		for(int i = 0; i< S.length();i++) {
			if(S.charAt(i)=='0') z++;
			else if(S.charAt(i)=='1') x++;
		}
		System.out.println(Math.min(z, x)*2);

	}

}
