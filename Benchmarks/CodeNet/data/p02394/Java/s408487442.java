import java.util.Scanner;
class Main{
public static void main(string[] args){
Scanner scan= new Scanner(System.in);
String A=scan.next();
String B=scan.next();
String C=scan.next();
String D=scan.next();
String E=scan.next();
int a=Intger.parseInt(A);
int b=Intger.parseInt(B);
int c=Intger.parseInt(C);
int d=Intger.parseInt(D);
int e=Intger.parseInt(E);
int f=0;
if(a<(c+e))
f=1;
if(b<(d+e))
f=1;
if(f==0)
System.out.println(Yes);
else
System.out.println(No);
}
}