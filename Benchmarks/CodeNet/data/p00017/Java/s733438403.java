import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main
{
		public static void main(String[] args) throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String s;
			while((s=br.readLine())!=null)
			{
			int caesar = 0;
			char[] cipher = s.toCharArray();
				
			find : for (int i = 0; i < cipher.length - 5; i++) {
					if(cipher[i] - cipher[i+1] == 't'-'h'){
						if(cipher[i+1] - cipher[i+2] == 'h'-'e') {
							caesar = cipher[i] - 't';
							break find;
						} else if(cipher[i+1] - cipher[i+2] == 'h' - 'i'
								&& cipher[i+2] - cipher[i+3] == 'i' - 's') {
							caesar = cipher[i] - 't';
							break find;
						} else if(cipher[i+1] - cipher[i+2] == 'h' - 'a'
								&& cipher[i+2] - cipher[i+3] == 'a' - 't') {
							caesar = cipher[i] - 't';
							break find;
						}
					}
			}
				for (int j = 0; j < cipher.length; j++) {
					if(Character.isLowerCase(cipher[j])) cipher[j] -= caesar;
					System.out.print(cipher[j]);
				}
				System.out.println();
			}
		}
}