
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String args[]) {
		// テキスト入力
		Scanner sc = new Scanner(System.in);
		String all_out = "";
		String out = "";

		while (true) {

			int height = sc.nextInt();
			int width = sc.nextInt();

			if (height == 0 && width == 0){
				break;
			}
			// #を出す処理
			// 行の数
			for (int h = 0; h < height; h++) {

				// 列の数
				for (int w = 0; w < width; w++) {
					out = out+"#";
				}
				out = out+"\n";
			}
			all_out = all_out+out+"\n";
			out = "";
		}
		all_out = all_out+"\n";
		System.out.println(all_out);
	}
}