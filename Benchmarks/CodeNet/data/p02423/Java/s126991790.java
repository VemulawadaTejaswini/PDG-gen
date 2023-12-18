import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		int bitArray[] = new int[32];

		for(int i = 0; x > 0; i++) {
			bitArray[i] = (int)(x % 2);
			x /= 2;
		}

		for(int i = 0; i < 32; i++) {
			System.out.print(bitArray[31 - i]);
		}
		System.out.println();
		for(int i = 0; i < 32; i++) {
			System.out.print(3 % (bitArray[31 - i] + 2));
		}
		System.out.println();
		for(int i = 0; i < 31; i++) {
			System.out.print(bitArray[30 - i]);
		}
		System.out.println(0);
		System.out.print(0);
		for(int i = 0; i < 31; i++) {
			System.out.print(bitArray[31 - i]);
		}
		System.out.println();
	}

}

