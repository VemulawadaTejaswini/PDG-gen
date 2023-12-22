import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int Count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1;i < 10; i++) {
			if( n % i == 0) {
				int j = n/i;
				if(j<= 9) {
					Count++;
				}
			}
		}
		if(Count == 0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}