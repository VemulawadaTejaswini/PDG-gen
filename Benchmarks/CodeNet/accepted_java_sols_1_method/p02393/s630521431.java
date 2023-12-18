import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int list1[] = {a,b,c};
		Arrays.sort(list1);


		System.out.println(list1[0] + " " + 
		list1[1] + " " + list1[2]);

		
	}
}
