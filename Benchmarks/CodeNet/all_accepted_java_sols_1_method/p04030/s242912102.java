import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.nextLine());
		sc.close();
		
		int B_position = 1;
		while (B_position != -1) {
			B_position = sb.indexOf("B");
			if (B_position == 0) {
				sb.delete(B_position, B_position + 1);
			} else if ( B_position == -1) {
				continue;
			} else {
				sb.delete(B_position -1, B_position + 1);
			}
		}
		
		System.out.println(sb);
	}
}