import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long a = sc.nextLong();
		String b = sc.next();
		String B = b.replace(".", "");
		
		// 計算
		long result = 0;
		result = (a*Long.valueOf(B))/100;
		
		// 出力
		System.out.println(result);
	}

}
