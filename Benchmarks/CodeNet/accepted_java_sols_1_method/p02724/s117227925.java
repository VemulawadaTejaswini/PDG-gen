import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		int point = 0;
		while (money >= 500) {
			money -= 500;
			point += 1000;
		}
		while (money >= 5) {
			money -= 5;
			point += 5;
		}
		System.out.println(point);
		scan.close();
	}
}