import java.io.IOException;
import java.util.Scanner;

// どうやって空白で区切られた入力値を二つのデータとして認識する？
// Scannerというものを使う
public class Main {
	public static void main(String[] args) throws IOException{

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();

		System.out.println(a*b+ " "+(a*2+b*2));

	}
}

