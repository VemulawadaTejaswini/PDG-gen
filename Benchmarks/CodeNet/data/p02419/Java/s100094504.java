import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String w = br.readLine();
		StringBuilder sb = new StringBuilder();
		String buf = "";
		do
		{
			buf = br.readLine();
			sb.append(buf.toLowerCase()+ " ");
		}while(buf != "END_OF_TEXT");
		int chk = 0, sum = 0;
		while(chk != -1)
		{
			chk = sb.indexOf(w, chk);
			sum++;
		}
		System.out.println(sum);
	}
}