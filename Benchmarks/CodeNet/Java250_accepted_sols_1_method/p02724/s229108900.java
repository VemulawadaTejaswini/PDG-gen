import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = 0;
        if(x % 500 == 0) {
        	result = 1000 * (x / 500);
        }else {
        	result = 1000 * (x / 500) + (x % 500) / 5 * 5;
        }
        System.out.print(result);
        
	}
}