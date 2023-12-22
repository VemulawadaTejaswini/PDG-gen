import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();

		int asel = Math.min(a, k);
		int bsel = Math.min(b, k-asel);
		int csel = Math.min(c, k-asel-bsel);
		
		System.out.println(asel - csel);
	}

}

