import java.io.*;
class Main
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
while(true)
{
int n=Integer.parseInt(input.readLine());
if(n==0)break;
int sum=0;
for(int i=0;i<n/4;i++)
{
int x=Integer.parseInt(input.readLine());
sum+=x;
}
System.out.println(sum);
}
}
}