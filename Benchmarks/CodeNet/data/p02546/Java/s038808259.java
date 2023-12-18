import java.io.*;

 public class Main
{

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));

		String str1=br.readLine();
		
		if(str1.endswih("s")){
			System.out.println(str1 + "es");
		}

		else{
			System.out.println(str1 +'s');
		}
	}
}