import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);

			if(Character.isLowerCase(c)){
				System.out.print(Character.toUpperCase(c));
			}else if(!Character.isLowerCase(c)){
				System.out.print(Character.toLowerCase(c));
			}else{
				System.out.println(c);
			}
		}
		System.out.println();
	}
}