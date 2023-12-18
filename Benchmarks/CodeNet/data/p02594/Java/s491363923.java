import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		String ans = "No";
		if(X>=30) {
			ans  = "Yes";
		}
		
		System.out.println(ans);	
	}
}