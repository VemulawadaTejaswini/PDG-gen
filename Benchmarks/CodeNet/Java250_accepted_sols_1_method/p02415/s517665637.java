import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		char[] ch = input.toCharArray();
		for(int i = 0; i < ch.length; i++){
			if(Character.isUpperCase(ch[i])){
				ch[i] = Character.toLowerCase(ch[i]);
			}else if(Character.isLowerCase(ch[i])){
				ch[i] = Character.toUpperCase(ch[i]);
			}
			System.out.print(ch[i]);
		}
		System.out.println();

	}

}