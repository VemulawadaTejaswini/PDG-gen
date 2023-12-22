import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		//文字の個数
		int quantity = 0;
		//１文字の長さ
		int length = 0;
		String anser = "";

		Scanner scan = new Scanner(System.in);

        quantity = scan.nextInt();
        length = scan.nextInt();

		//入力された文字を入れる配列
		String[] str = new String[quantity];

		for(int i = 0;i<quantity;i++) {
			str[i] = scan.next();
		}

		Arrays.sort(str);
		for(String s:str) {
			anser = anser + s;
		}

		System.out.println(anser);
	}

}
