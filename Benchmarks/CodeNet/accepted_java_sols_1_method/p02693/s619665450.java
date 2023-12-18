import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int k=sc.nextInt();
int a=sc.nextInt();
int b=sc.nextInt();
int f=0;
for(int i=a;i<=b;i++)
{
if(i%k==0)
{
f=1;
break;
}
}
if(f==1)
System.out.println("OK");
else
System.out.println("NG");
}
}
