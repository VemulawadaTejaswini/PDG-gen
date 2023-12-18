import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			int sum = 0;
			int num = scan.nextInt();
			if(num == 0){
				scan.close();
				break;
			}
			sum += num % 10;
			while(num / 10 != 0){
				num /= 10;
				sum += num % 10;
			}
			System.out.println(sum);
		}
	}
}