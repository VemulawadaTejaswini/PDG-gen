import java.util.Scanner;
import java.math.*;
import java.text.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int cur = 100;
		for(int i = 0; i < n; i++){
			cur = (int)Math.ceil(cur*1.05);
		}
		System.out.println(cur*1000);
	}

}