import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] ch = str.toCharArray();

		for(int i = 0; i < str.length(); i++){
			if(Character.isUpperCase(ch[i])){
				ch[i] = Character.toLowerCase(ch[i]);
			}else{
				ch[i] = Character.toUpperCase(ch[i]);
			}

		}
		System.out.println(ch);
	}
}