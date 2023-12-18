import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();
		str=br.readLine();
		System.out.println(irekae(str));
	}
	
	public static String irekae(String str){
		int i;
		String str2 = new String();;
		StringBuilder sb = new StringBuilder(str2);
		char[]  moji = new char[20];
		
		for(i=0;i<str.length();i++){
			moji[i]=str.charAt(i);
		}
		for(i=0;i<str.length();i++){
			sb.append(moji[str.length()-i-1]);
		}
		return sb.toString();
	}

}