import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String w = br.readLine();
		StringBuilder sb = new StringBuilder();
		while(sb.indexOf("END_OF_TEXT") == -1)
		{
			sb.append(" " + br.readLine());
		}
		StringBuilder sb2 = new StringBuilder();
		sb2.append(sb.toString().toLowerCase());
		int chk = 0, sum = 0;
		while(true)
		{
			chk = sb2.indexOf(" " + w + " ", chk);
			if(chk==-1)	break;
			sum++;
			chk++;
		}
		System.out.println(sum);
	}
}