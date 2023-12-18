import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		if(n >= 3200) {
			System.out.println(sc.nextLine());
		} else {
			System.out.println("red");
		}

	}
}