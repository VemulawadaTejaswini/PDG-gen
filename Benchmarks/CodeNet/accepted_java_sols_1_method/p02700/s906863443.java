import java.util.*;
import java.math.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
while(a>0 && c>0)
{
	a=a-d;
	c=c-b;

}
if(c<=0)
System.out.println("Yes");
else
System.out.println("No");
}}