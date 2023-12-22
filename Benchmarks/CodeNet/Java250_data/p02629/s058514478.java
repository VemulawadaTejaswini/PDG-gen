import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		Long n = Long.parseLong(sc.next());


		String ans = "";
		while(n != 0) {
			char tmp;
			if(n%26 == 0) {
				tmp = 'z';
				n = n/26 -1;
			}else {
				tmp = (char) (n%26 +96);
				n /= 26;

			}

			ans = tmp + ans;

		}
		System.out.println(ans);
	}
}


