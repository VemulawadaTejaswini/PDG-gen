import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int price = scan.nextInt();
		
		int count = 0;
		for(int x = 0; x <= a; x++){
			for(int y = 0; y <= b; y++){
				for(int z = 0; z <= c; z++){
					if(500 * x + 100 * y + 50 * z == price)count++;
				}
			}
		}
		System.out.println(count);
	}
}