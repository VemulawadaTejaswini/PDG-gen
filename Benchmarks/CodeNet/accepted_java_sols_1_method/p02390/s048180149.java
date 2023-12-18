import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 秒単位の時間 Sが与えられるので、h:m:sの形式へ変換して出力してください。
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		
		int h = S / 3600;
		int m = (S % 3600) / 60;
		int s = S % 60;
		
		System.out.println(h + ":" + m + ":" + s);

	}

}

