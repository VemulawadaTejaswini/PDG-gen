import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = Integer.parseInt(s.next());
		int b = Integer.parseInt(s.next());

		if(a < b){
			System.out.println("a < b");
		} else if(a > b){
			System.out.println("a > b");
		} else {
			System.out.println("a == b");
		}
	}

}