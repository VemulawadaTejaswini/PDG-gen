import java.util.Scanner;

public class Main {




	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	// 入力

	int h = sca.nextInt();
	int a = sca.nextInt();

	int ans = 0;
	if(h % a  > 0) {
		System.out.println(h/a + 1);
	}
	else {
		System.out.println(h/a);
	}

	// 後始末
	sca.close();
	}
}