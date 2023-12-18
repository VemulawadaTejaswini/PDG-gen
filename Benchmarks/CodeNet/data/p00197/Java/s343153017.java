import java.io.*;
class Main
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
while(true)
{
String str=input.readLine();
String str_ary[]=str.split(" ");
if(str_ary[0].equals("0") && str_ary[1].equals("0"))break;
int x,y,big,small,count=0;
x=Integer.parseInt(str_ary[0]);
y=Integer.parseInt(str_ary[1]);
if(x>y)
{
big=x;
small=y;
}
else 
{
big=y;
small=x;
}
while(true)
{
System.out.println(big+" "+small);
if((big%small)==0)
{
count++;
break;
}
int tmp=big%small;
big=small;
small=tmp;
count++;
}
System.out.println(small+" "+count);
}
}
}