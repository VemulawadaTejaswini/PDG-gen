import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int a=t%10;
if(a==2 || a==4 || a==5 || a==7 || a==9)
System.out.println("hon");
else if(a==0 || a==1 || a==6 || a==8)
System.out.println("pon");
else if(a==3)
System.out.println("bon");

}
}
 