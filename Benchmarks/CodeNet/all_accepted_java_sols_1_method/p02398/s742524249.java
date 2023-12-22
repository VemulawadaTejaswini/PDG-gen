import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;
		int i = 0;
		int ans = 0;

		Scanner in = new Scanner(System.in);

		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();

		while(a<=b){
			if (c % a == 0){
				ans++;
			}else{

			}
		a++;
		}

		System.out.println(ans);

	}

}