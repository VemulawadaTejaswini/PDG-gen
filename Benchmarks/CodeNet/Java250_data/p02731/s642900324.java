import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double LLL = Double.parseDouble(br.readLine());
		double L = LLL/3; 
		
		System.out.println(L*L*L);	
	}
}