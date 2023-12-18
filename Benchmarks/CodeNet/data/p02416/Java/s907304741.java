import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws NumberFormatException {
		Scanner scan = new Scanner(System.in);
		while(true){
			int x = scan.nextInt();
			if(x == 0){
				break;
			}
			int sum = 0;
			for(; x > 0 ; x /= 10){
				sum += x % 10;
			}
			System.out.println(sum);
		}
	}
}