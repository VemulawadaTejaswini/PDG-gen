import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int sum = scan.nextInt();
		int s = sum%60;
		int h = sum/3600;
		int m = (sum%3600)/60;
		System.out.println(h+":"+m+":"+s);
	}
}