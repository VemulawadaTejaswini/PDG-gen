import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int prize =-1;
		for (int i=1;i<20000;i++) {
			if((int)(i*0.08)==a&& (int)(i*0.1)==b) {
				prize = i;
				break;
			}
		}
		System.out.println(prize);

	}
}