import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();
		int count = 0;
		int count2 = 0;
		while (count < n){
			count += x;
			count2 += t;
		}
		System.out.println(count2);
	}

}
