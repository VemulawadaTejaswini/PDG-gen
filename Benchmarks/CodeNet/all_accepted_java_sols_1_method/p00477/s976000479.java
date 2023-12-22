import java.io.*;
class Main
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

int sum=0;
for(int i=0;i<4;i++)
{
sum+=Integer.parseInt(input.readLine());
}
System.out.println(sum/60);
System.out.println(sum%60);
}
}