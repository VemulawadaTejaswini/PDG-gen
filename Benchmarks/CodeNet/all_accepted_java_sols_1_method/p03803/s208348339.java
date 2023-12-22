import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());

		if (a == 1){
			a = 14;
		}
		if (b == 1){
			b = 14;
		}

		if (a > b){
			System.out.println("Alice");
		}else if (a < b){
			System.out.println("Bob");
		}else{
			System.out.println("Draw");
		}
	}
}
