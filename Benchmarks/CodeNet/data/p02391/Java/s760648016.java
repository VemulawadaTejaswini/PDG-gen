import java.io.*;

class Main
{

	public static void main(String args[]) throws IOException
	{

		BufferedReader br =
		new BufferedReader( new InputStreamReader(System.in));

		String str1=br.readLine();
                String str2=str1.split(" ");
                String str3=br.readLine();
		int a=Integer.parseInt(str1);
                int b=Integer.parseInt(str3);

		if(a<b){
			System.out.println(a+"<"+b);
                       }
                else(a>b){
                        System.out.println(a+">"+b);
                       }
                else(a==b){
                        System.out.println(a+"=="+b);
                       }

	}
}