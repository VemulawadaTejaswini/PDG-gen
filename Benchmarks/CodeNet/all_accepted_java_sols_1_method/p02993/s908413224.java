import java.util.*;
import java.math.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();int f=0;
for(int i=0;i<3;i++)
{
if(s.charAt(i)==s.charAt(i+1))
{
f=1;
break;
}
}
if(f==1)
System.out.println("Bad");
else
System.out.println("Good");
}}