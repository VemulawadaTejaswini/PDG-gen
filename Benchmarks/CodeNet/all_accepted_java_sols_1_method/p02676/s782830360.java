import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
String s=sc.next();
if(s.length()<=t)
System.out.println(s);
else
{
s=s.substring(0,t)+"...";
System.out.println(s);
}
}
}
 