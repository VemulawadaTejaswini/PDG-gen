import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan =new Scanner(System.in);
String str1=scan.next();
String str2=scan.next();
String str3=scan.next();
int a=Integer.parseInt(str1);
int b=Integer.parseInt(str2);
int c=Integer.parseInt(str3);
if(a<b&&b<c)
System.out.println("Yes");
else
System.out.println("No");
}
}