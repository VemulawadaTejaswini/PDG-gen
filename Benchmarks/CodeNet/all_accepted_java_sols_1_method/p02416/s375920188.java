import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer sum;
		for(;;) {
			sum = 0;
			String str = sc.next();
			if(str.equals("0")) {
				break;
			}
			for(int i = 0; i < str.length(); i++) {
				sum += Integer.parseInt("" + str.charAt(i));
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
