import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long money = 100;
		int y = 0;
		while(x > money) {
			money = money + money / 100;
			y++;
		}
		System.out.println(y);
	}
}