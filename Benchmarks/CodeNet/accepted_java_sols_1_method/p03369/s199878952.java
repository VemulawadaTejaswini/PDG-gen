import java.io.*;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		int topping = 0;

		for(int i=0; i<3; i++) {
			if(s.charAt(i) == 'o') topping += 100;
		}
		System.out.println(topping + 700);
	}
}
