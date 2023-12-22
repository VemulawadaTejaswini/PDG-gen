import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int strSize = 0;
		str = br.readLine();
		StringBuilder sb = new StringBuilder(str);
		strSize = str.length();
		for(int i = 0; i < strSize; ++i){
			char judge = sb.charAt(i);
			if(Character.isLowerCase(judge)){
				char tmp = Character.toUpperCase(judge);
				sb.setCharAt(i, tmp);
			}
			else if(Character.isUpperCase(judge)){
				char tmp = Character.toLowerCase(judge);
				sb.setCharAt(i, tmp);
			}
		}
		System.out.println(sb);
	}
}