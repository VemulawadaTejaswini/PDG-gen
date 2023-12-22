import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sArray = sc.next().split("");
		double k = sc.nextDouble();
		for(int i = 0;i < sArray.length;i++) {
			double number = Double.parseDouble(sArray[i]);
			double count = Math.pow(number,5.0 * Math.pow(10, 15) );
			k -= count;
			if(k <= 0) {
				System.out.println((int)number);
				return;
			}
		}
	}
}