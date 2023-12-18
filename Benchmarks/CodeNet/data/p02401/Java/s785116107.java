import java.io.*;
import java.util.Scanner;
class main{
 public static void main(String[] args){
  int a,b;
  String op;
  Scanner sc= new Scanner(System.in);
  while(true){
   a=sc.nextInt();
   op=sc.next();
   b=sc.nextInt();
   if(op=='+')
    System.out.println((a+b));
   else if(op=='-')
    System.out.println((a-b));
   else if(op=='*')
    System.out.println((a*b));
   else if(op=='/')
    System.out.println((a/b));
   else if(op=='?')
    break;}
 }
}
