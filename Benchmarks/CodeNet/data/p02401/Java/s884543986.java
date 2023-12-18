import java.io.*;
import java.util.Scanner;
class main{
 public static void main(String[] args){
  int a,b;
  char op;
  Scanner sc= new Scanner(System.in);
  while(True){
   a=sc.nextInt();
   op=sc.next();
   b=sc.nextInt();
   if(op=='+')
    System.out.println((a+b));
   else if(op=='-')
    System,out.println((a-b));
   else if(op=='*')
    System,out.println((a*b));
   else if(op=='/')
    System.out.println((a/b));
   else if(op=='?')
    break;}
 }
}
