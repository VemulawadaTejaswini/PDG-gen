import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append(br.readLine());
		
		for(int i=0; i<sb.length(); i++)
		{
			char chk = sb.charAt(i);
			if(Character.isUpperCase(chk))
			{
				chk = Character.toLowerCase(chk);
				sb.setCharAt(i, chk);
			}
			else if(Character.isLowerCase(chk))
			{
				chk = Character.toUpperCase(chk);
				sb.setCharAt(i, chk);
			}
		}
		System.out.println(sb.toString());
	}
}