import java.util.Scanner;
class Main{
	
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String a=sc.next();
String b=sc.next();
String c=sc.next();
a=a.toUpperCase();
b=b.toUpperCase();
c=c.toUpperCase();
String A=a.substring(0,1);
String B=b.substring(0,1);
String C=c.substring(0,1);

System.out.println(A+B+C);
 }
}
  