import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//ペンキの種類
		int count = 1;
		//条件分岐
		if(a == b) {
			if(b == c) {
				System.out.println(count);
				return;
			}else {
				count++;
				System.out.println(count);
				return;
			}
		}else if (a == c) {
			count++;
			System.out.println(count);
			return;
		}else if(b == c) {
			count++;
			System.out.println(count);
		}else {
			count += 2;
			System.out.println(count);
		}
	}

}
