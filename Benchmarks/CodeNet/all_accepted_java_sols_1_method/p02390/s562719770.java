import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 秒単位の時間 S が与えられるので、h:m:s の形式へ変換して出力してください。ここで、h は時間、m は 60 未満の分、s は 60 未満の秒とします。
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int m = s/60%60;
		int h = s/3600;
		s = s%60;
		System.out.println(h + ":" + m + ":" + s);
	}
}