import java.io.*;
class Main
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
while(true)
{
int max=0;
String ans="";
int j=0;
for(int i=0;i<5;i++)
	{
String str=input.readLine();
String str_ary[]=str.split(" ");

if(str_ary[0].equals("0") && str_ary[1].equals("0"))
{
System.exit(0);
}
	
	int m,a;
	String s[]={"A","B","C","D","E"};	
	m=Integer.parseInt(str_ary[0]);
	a=Integer.parseInt(str_ary[1]);
	if(max<m+a)
	{
	max=m+a;
	ans=s[i];
	}
	
	}
	System.out.println(ans+" "+max);
	}
}


}