import java.io.*;
class Main
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
while(true)
{

int fee=Integer.parseInt(input.readLine());
if(fee==0)break;
int sum=0;
for(int i=0;i<9;i++)
{
sum+=Integer.parseInt(input.readLine());
}
System.out.println(fee-sum);
}
}
}