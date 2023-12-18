import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//キーボード入力メソッド
		Scanner sc = new Scanner(System.in);

		//入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		//処理
		int array[] = {a,b,c};
		Arrays.sort(array);

		//出力
		System.out.println(array[0] +" "+ array[1] +" "+ array[2]);
	}

}

