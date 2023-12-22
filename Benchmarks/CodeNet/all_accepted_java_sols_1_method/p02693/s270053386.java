import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int k = sca.nextInt();
		int a = sca.nextInt();
		int b = sca.nextInt();

		int count = 2;
		boolean flag = false;
		for(int i = k; i <= b; i = k*count) {
			if(a <= i && i <= b) {
				flag = true;
				break;
			}
			count++;
		}

		if(flag) {
			System.out.println("OK");
		}
		else {
			System.out.println("NG");
		}

		// 後始末
		sca.close();
	}
}