import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		if(a>=1 && a<=9) {
			if(b>=1 && b<=9) {
				System.out.println(a*b);
			}
			else {
				System.out.println(-1);
			}
		}
		else {
			System.out.println(-1);
		}
	}
}