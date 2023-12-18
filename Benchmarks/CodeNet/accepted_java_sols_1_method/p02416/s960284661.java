import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			String str = sc.next();
			int sum=0;

			if(str.equals("0")) {
				break;
			}

			for(int i=0; i<str.length(); i++) {
				String s=str.substring(i,i+1);
				sum += Integer.valueOf(s);
			}
			System.out.println(sum);
		}

	}
}
