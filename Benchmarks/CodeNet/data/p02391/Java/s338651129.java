import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Input test = new Input();
		test.Judge();
	}
}

class Input {
	public void Judge() {
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		int b = num.nextInt();

		if (a > b) {
			System.out.println("a > b");
		} else if(a < b) {
			System.out.println("a < b");
		}else {
                        System.out.println("a == b");
                }
	}
}