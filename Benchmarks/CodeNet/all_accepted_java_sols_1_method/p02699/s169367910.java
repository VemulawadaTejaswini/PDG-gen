import java.util.*;
import java.io.*;

public class Main {
		public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] SW = br.readLine().split(" ");
		
		int S = Integer.parseInt(SW[0]);
		int W = Integer.parseInt(SW[1]);
		
		System.out.println(S>W? "safe" : "unsafe");
	}
}
