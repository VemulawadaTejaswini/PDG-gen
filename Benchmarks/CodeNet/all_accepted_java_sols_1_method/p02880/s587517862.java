import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		for(int i=1;i<10;i++) {
			if(a%i==0 && (a/i<=9 && a/i>=1)) {
				System.out.println("Yes");
				return;
			}
		}System.out.println("No");
	}
}