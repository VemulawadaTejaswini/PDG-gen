import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Long x = scanner.nextLong();
		Long y = scanner.nextLong();
		int count = 0;
		while(x <= y){
			x *= 2;
			count++;
		}
		System.out.println(count);
	}

}
