import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			while(!(a <= b && b <= c)){ //ソートできるまでやる
				if(a > b) {
					a = a ^ b;
					b = a ^ b;
					a = a ^ b; //aとb入れ替え
				}
				if(b > c) {
					b = b ^ c;
					c = b ^ c;
					b = b ^ c; //bとc入れ替え
				}
			}
			System.out.println(a + " " + c);
		}
	}
}
