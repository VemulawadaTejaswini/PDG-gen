import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int tmp = sc.nextInt();
		int num = tmp % 10;
 
        if (num == 2 || num == 4 || num == 5 || num == 7 || num == 9) {
			System.out.println("hon");
		} else if (num == 0 || num == 1 || num == 6 || num == 8) {
			System.out.println("pon");
		} else {
			System.out.println("bon");
		}
 
	}
 
}