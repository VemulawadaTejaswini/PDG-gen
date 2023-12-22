import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=br.readLine())!=null){
			char[] chars = s.toCharArray();
			for(char c : chars){
					if(Character.isLowerCase(c)) System.out.print((char)(c-32));
					else	   						 System.out.print(c);
			}
			System.out.println();
		}
    }
}