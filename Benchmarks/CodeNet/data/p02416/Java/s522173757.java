import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			String number = sc.nextLine();
			long sum = 0;

			if(number.equals("0")) break;
			else {
				for(int i=0;i<String.valueOf(number).length();i++) {
					int j = i;
					sum += Integer.parseInt(String.valueOf(number).substring(i,j+1));
				}
			}
			System.out.println(sum);
		}
	}
}

