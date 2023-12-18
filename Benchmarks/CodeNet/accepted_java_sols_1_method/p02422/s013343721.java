import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		str.append(br.readLine());
		int q = Integer.parseInt(br.readLine());
		String[] command = new String[4];
		String buf;
		int opr1, opr2;
		for(int i=0; i<q; i++)
		{
			command = br.readLine().split(" ");
			opr1 = Integer.parseInt(command[1]);
			opr2 = Integer.parseInt(command[2]);
			switch(command[0])
			{
			case "print":
			{
				System.out.println(str.substring(opr1, opr2+1));
				break;
			}
			case "reverse":
			{
				buf = new StringBuilder(str.substring(opr1, opr2+1)).reverse().toString();
				str.replace(opr1, opr2+1, buf);
				break;
			}
			case "replace":
			{
				str.replace(opr1, opr2+1, command[3]);
				break;
			}
			
			}
		}
	}
}
