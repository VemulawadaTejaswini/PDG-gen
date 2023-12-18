import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan= new Scanner(System.in);
String A=scan.next();
String B=scan.next();
String C=scan.next();
String D=scan.next();
String E=scan.next();
int a=Integer.parseInt(A);
int b=Integer.parseInt(B);
int c=Integer.parseInt(C);
int d=Integer.parseInt(D);
int e=Integer.parseInt(E);
int f=0;
if(a<(c+e)||a-e<0)
f=1;
if(b<(d+e)||b-e<0)
f=1;
if(f==0)
System.out.println("Yes");
else
System.out.println("No");
}
}