import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			if(scn.nextInt() >= 3200) {
				System.out.println(scn.next());
			} else {
				System.out.println("red");
			}
		}
	}
}
