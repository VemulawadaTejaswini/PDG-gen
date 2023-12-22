import java.util.*;
import java.io.*;
import java.math.*;
 class Main
{
	public static void main(String[] args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Scanner in= new Scanner(System.in);
int n=Integer.parseInt(br.readLine());
String s=br.readLine();
for(int i=0;i<s.length();i++)
{
	char c=s.charAt(i);
	int each= n+c;
	if(each>=91)
	{
		each=each-26;
	}
	System.out.print((char)each);

}
}
}
