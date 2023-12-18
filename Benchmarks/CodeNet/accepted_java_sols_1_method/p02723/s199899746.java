import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String[]s = stdIn.next().split("");

		boolean flag = true;

		String t = "coffee";


		if(!s[2].equals(s[3]) || !s[4].equals(s[5])) {
			flag = false;
		}

		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}



	}

}
