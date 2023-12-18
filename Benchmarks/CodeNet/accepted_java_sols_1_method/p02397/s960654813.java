import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
while(true){
String A=scan.next();
String B=scan.next();
int a=Integer.parseInt(A);
int b=Integer.parseInt(B);
if(a==0&&b==0)
	break;
int okiba;
if(a>b){
okiba=a;
a=b;
b=okiba;
}
System.out.println(a+" "+b);
}
}
}