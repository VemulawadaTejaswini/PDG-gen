import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int ans = 0;
		if (a < b){
			if (b < c)
				ans = a * b / 2;
			else
				ans = a * c / 2;
		}
		else if (a < c)
			ans = a * b / 2;
		else
			ans = b * c / 2;
		
		System.out.println(ans);

	}

}