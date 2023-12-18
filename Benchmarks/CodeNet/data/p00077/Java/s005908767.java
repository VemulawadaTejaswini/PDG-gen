
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> input = new ArrayList<String>();
		String buf;
		while((buf = br.readLine()) != null){
			input.add(buf);
		}
		for(String str : input){
			System.out.println(unzipString(str));
		}
	}
	public static String zipString(String str){
		StringBuffer bf = new StringBuffer();
		return bf.toString();
	}
	public static String unzipString(String str){
		StringBuffer bf = new StringBuffer();
		char[] c = str.toCharArray();
		for(int i = 0; i < c.length; i++){
			if(c[i] == '@'){
				int n = Integer.parseInt(String.valueOf(c[++i]));
				char tmp = c[++i];
				for(int j = 0; j < n; j++){
					bf.append(tmp);
				}
			}
			else{
				bf.append(c[i]);
			}
		}
		return bf.toString();
	}
}