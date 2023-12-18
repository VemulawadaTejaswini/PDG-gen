import java.io.*;
import java.util.*;
 class Main
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
long n=s.nextLong();
long count=0,min=Long.MAX_VALUE;
for(int i=1;i<=(int)Math.sqrt(n);i++)
{if(n%i==0)
{count=(i-1)+(n/i)-1;
if(count<min)
min=count;}}
System.out.println(min);}}