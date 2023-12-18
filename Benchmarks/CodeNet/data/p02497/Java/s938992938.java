import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			while(a != -1 || b != -1 || c != -1){
				int sum = a + b;
				if(sum >= 80){
					System.out.println("A");
				} else if(65 <= sum && sum < 80){
					System.out.println("B");
				} else if(50 <= sum && sum < 65){
					System.out.println("C");
				} else if(30 <= sum && sum < 50){
					if(c >= 50){
						System.out.println("D");
					} else {
						System.out.println("C");
					}
				} else if(sum < 30){
					System.out.println("F");
				}
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
			}
		}
	}
}