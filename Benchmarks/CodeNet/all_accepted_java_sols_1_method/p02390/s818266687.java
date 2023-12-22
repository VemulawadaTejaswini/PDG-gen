import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int h = 0;
		int m = 0;
		int s = 0;

		while(num >= 3600) {
			num -= 3600;
			h++;
		}
		while(num >= 60) {
			num -= 60;
			m++;
		}

		s = num;

		System.out.println(h + ":" + m +  ":" + s);
	}
}