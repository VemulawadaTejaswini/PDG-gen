import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int w = sc.nextInt();   /*tate-bou*/
	int n = sc.nextInt();   /*yoko-bou*/
	int[] values = new int[w];
	for (int i = 0; i < values.length; i++) {
		values[i] = i + 1;  /*store numbers 1,2,3,4,.... in "values"*/
	}
	for (int i = 0; i < n; i++) {
		String str = sc.next();
		String[] ab = str.split(",");
		int a = Integer.parseInt(ab[0]) - 1;
		int b = Integer.parseInt(ab[1]) - 1;
		/*use "a" and "b" to control "values"*/
		int box;
		box = values[a];
		values[a] = values[b];
		values[b] = box;
		/*-----------------------------------*/
	}
	/*out-put of "values"*/
	for (int i = 0; i < w; i++) {
		System.out.println(values[i]);
	}
	/*-------------------*/
}
}