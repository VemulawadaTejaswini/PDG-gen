import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer output = 0;

		Integer coins500 = new Integer(scanner.next());
		Integer coins100 = new Integer(scanner.next());
		Integer coins50 = new Integer(scanner.next());
		Integer total = new Integer(scanner.next());

		for(int i = 0; i<= coins500;i++) {
			for(int j= 0;j<=coins100;j++) {
				for(int k = 0; k <=coins50;k++) {
					if(total == (i*500+j*100+k *50)) {
						output ++ ;
					}
				}
			}
		}
		System.out.println(output);
		scanner.close();
	}
}