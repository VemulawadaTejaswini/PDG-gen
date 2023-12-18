import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		long a = x;
		int length = 0;
		while(true) {
			if(a <= y) {
				a = a * 2;
				length++;
			}else {
				System.out.println(length);
				return;
			}
		}
	}
}