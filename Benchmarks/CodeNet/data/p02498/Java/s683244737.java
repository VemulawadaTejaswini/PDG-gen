import java.io.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		String in = br.readLine();                   // 入力文字列
		String[] in_array = new String[in.length()];
		
		for (int i = 0; i < in_array.length; i++) {
			
			in_array[i] = String.valueOf(in.charAt(i));
			
			// 真ならin_array[i]は、小文字
			if (in_array[i].equals(in_array[i].toLowerCase())) {
				in_array[i] = in_array[i].toUpperCase();
			} else {
				in_array[i] = in_array[i].toLowerCase();
			}
			
		}
		for (String s : in_array) {
			System.out.print(s);
		}
	}
	
}