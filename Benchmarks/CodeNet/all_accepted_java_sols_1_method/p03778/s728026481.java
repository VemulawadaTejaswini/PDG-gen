
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner s = new Scanner(System.in);
		int w = s.nextInt();
		int a =  s.nextInt();
		int b = s.nextInt();
		int temp = a;
		int temp2 = b;
		a = Math.min(temp, temp2);
		b = Math.max(temp, temp2);
		if(b - (a+w) <= 0 ){
			System.out.println(0);
		} else {
			System.out.println(b - (a+w));
		}
	}

}