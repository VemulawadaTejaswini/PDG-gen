import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
int a=ob.nextInt();	
int b=ob.nextInt();	
int c=ob.nextInt();
if(c>=a&&c<=b)
{
System.out.println("Yes");
}
else
System.out.println("No");
}
}