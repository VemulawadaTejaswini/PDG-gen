import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(sumOfDecimalPlaces(a, b, n));
		}
		sc.close();
	}
	
	static int sumOfDecimalPlaces(int a, int b, int n) {
		int result = 0;
		int remain = a % b;
		int i = 0;
		while(remain != 0 && i < n) {
			remain = remain * 10;
			result += remain / b;
			remain = remain % b;
			i++;
		}
		return result;
	}
}