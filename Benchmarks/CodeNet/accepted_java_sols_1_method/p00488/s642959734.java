import java.io.*;
class Main
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
int min1=0;
for(int i=0;i<3;i++)
{
int x=Integer.parseInt(input.readLine());
if(i==0)min1=x;
if(min1>x)min1=x;
}
int min2=0;
for(int i=0;i<2;i++)
{
int x=Integer.parseInt(input.readLine());
if(i==0)min2=x;
if(min2>x)min2=x;
}
System.out.println(min1+min2-50);
}
}