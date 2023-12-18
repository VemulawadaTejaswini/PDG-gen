import java.io.*;

public class Main {

public static void main(String[] args)throws IOException
{
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String str = reader.readLine();

int a = Integer.parseInt(str);
int h = a/3600;
a%=3600;
int m = a/60;
a%=60;
int s=a;

System.out.println(h+":"+m+":"+s);
}
}