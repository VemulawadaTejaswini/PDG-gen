import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
int cr=y/4;
int tur=(y-cr)/2;
int sum=cr+tur;
if(sum==x)
System.out.println("Yes");
else
System.out.println("No");
}
}
