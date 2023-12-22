import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long a = sc.nextLong();
		double b = sc.nextDouble();
		
		// 計算
		long result = 0;
		b += 0.001;
		long B = Double.valueOf(b*100).longValue();
		result = (a*B)/100;
		
		// 出力
		System.out.println(result);
	}

}
