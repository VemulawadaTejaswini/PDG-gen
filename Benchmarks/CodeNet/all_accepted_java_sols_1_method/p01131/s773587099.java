import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main{
	public static void main(String args[]){
		char key[][] = {
				null,
				{'.', ',', '!', '?', ' '},
				{'a', 'b', 'c'},
				{'d', 'e', 'f'},
				{'g', 'h', 'i'},
				{'j', 'k', 'l'},
				{'m', 'n', 'o'},
				{'p', 'q', 'r', 's'},
				{'t', 'u', 'v'},
				{'w', 'x', 'y', 'z'}
		};

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			for(int i = 0; i < n; i++){
				String str = br.readLine();
				// 最初のnを除去
				int index = 0;
				for(; index < str.length(); index++){
					if(str.charAt(index) != '0') break;
				}
				if(index == str.length()){
					System.out.println("");
					continue;
				}
				str = str.substring(index);
				//System.out.println(str);
				
				// 0 で分割
				String strs[] = str.split("0+");
				String result = "";
				for(String segment : strs){
					int button = segment.charAt(0) - '0';
					int count = segment.length() - 1;
					char chars[] = key[button];
					result += chars[count % chars.length];
				}
				
				System.out.println(result);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}