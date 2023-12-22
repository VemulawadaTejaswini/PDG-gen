import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	double money = 100;
	for (int i = 0; i < n; i++) {
	    money *= 1.05;
	    money = Math.ceil(money);
	}
	System.out.println((int)money * 1000);
    }
}