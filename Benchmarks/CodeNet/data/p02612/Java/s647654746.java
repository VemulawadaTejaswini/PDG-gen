import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 文字列
		
		int buf = n/1000;
		int result = 0;
		
		if (buf > 0) {
			result = (1000*(buf))-n;
			if(result != 0) {
				result = 1000 - result;
			}
		} else if(buf == 0) {
			result = 1000 - n;
		}

		System.out.println(result);
	}
}