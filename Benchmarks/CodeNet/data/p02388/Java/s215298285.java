import java.io.*;

class Main
{
public static void main (String[] args)throws IOException
{

BufferedReader br =
new BufferReader(new InputStreamReader(System.in));

String str = br.readLine();
int x = Integer.parseInt(str);

System.out.println( x*x*x );
}
}