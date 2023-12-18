import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// 初期化
		Scanner sc = new Scanner(System.in);
		long[] list = new long[5];

		long   n = sc.nextLong();
		list[0] = sc.nextLong();
		list[1] = sc.nextLong();
		list[2] = sc.nextLong();
		list[3] = sc.nextLong();
		list[4] = sc.nextLong();

		long result=0;
		
		// 最小値の取得
		Arrays.sort(list);
		
		result = (long)Math.ceil((double)((double)n / (double)list[0])) + 4;
		
		System.out.println(result);
	}
	
}
