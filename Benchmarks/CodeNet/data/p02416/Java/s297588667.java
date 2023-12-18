import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws NumberFormatException {
		Scanner scan = new Scanner(System.in);
		while(true){
			long x = scan.nextLong();
			if(x == 0){
				break;
			}
			long sum = 0;
			for(; x > 0; x /= 10){
				sum += x % 10;
			}
			System.out.println(sum);
		}
	}
}