import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int check_dev9 = 0;
		for(int i=0;i<N.length();i++) {
			check_dev9 = check_dev9 + (int)(N.charAt(i) - '1' +1);
		}

		if(check_dev9 % 9 == 0) {
			System.out.println("Yes");

		}else {
			System.out.println("No");
		}

	}

}