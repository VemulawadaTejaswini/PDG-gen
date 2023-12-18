import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int h,m,s;
		h = a / 3600;
		m = a % 3600 / 60;
		s = a % 3600 % 60;
		System.out.println(h + ":" + m + ":" + s);
	}
}