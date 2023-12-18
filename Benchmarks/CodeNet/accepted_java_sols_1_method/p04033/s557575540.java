import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int a = in.nextInt(), b = in.nextInt();
		if(a <= 0 && 0 <= b){
			System.out.println("Zero");
		}else{
			if(a < 0){
				int c = Math.min(b, 0);
				if(-(a - c) % 2 == 1){
					System.out.println("Positive");
				}else{
					System.out.println("Negative");
				}
			}else{
				System.out.println("Positive");
			}
		}
	}
}