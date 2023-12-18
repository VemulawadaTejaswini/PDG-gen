import java.io.*;
class Main
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
String str;
int i=0,sum=0;
while(!((str=input.readLine()).equals("=")))
{
if(i==0)sum+=Integer.parseInt(str);
if(str.equals("+"))
{
int x=Integer.parseInt(input.readLine());
sum+=x;
}
if(str.equals("-"))
{
int x=Integer.parseInt(input.readLine());
sum-=x;
}
if(str.equals("*"))
{
int x=Integer.parseInt(input.readLine());
sum*=x;
}
if(str.equals("/"))
{
int x=Integer.parseInt(input.readLine());
sum/=x;
}
i++;
}
System.out.println(sum);
}
}