import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ary = new int[n];
		for (int i = 0; i < n; i++) {
			ary[i] = sc.nextInt();
		}
		for (int i = ary.length - 1; i >= 0; i--) {
			while(i != 0){
			System.out.print(ary[i] + " ");
			i --;
			}
			System.out.print(ary[i]);
		}System.out.println("");
	}
}
