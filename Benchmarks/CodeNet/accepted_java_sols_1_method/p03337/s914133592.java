import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int wa = a + b;
		int sa = a - (b);
		int seki = a * b;
		int[] list = new int[] {sa, seki};
		int max = wa;
		for(int i =0; i < list.length; i++) {
			if(max < list[i]) {
				max = list[i];
			}
		}
		System.out.println(max);
	}
}