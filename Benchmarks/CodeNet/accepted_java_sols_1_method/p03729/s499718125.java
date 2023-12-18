import java.util.Scanner;
class Main{
	
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String A =sc.next();
String B=sc.next();
String C =sc.next();
System.out.println(A.charAt(A.length()-1)==B.charAt(0)&&B.charAt(B.length()-1)==C.charAt(0)?"YES":"NO");
 }
}
  