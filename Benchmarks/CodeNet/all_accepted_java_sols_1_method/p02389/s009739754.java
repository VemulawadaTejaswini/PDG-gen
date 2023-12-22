import java.util.Scanner;
class Main{
public static void main(String[] args)
{
Scanner scan =new Scanner(System.in);
String str1=scan.next();
String str2=scan.next();
int a=Integer.parseInt(str1);
int b=Integer.parseInt(str2);
System.out.println(a*b+" "+(a*2+b*2));
}
}