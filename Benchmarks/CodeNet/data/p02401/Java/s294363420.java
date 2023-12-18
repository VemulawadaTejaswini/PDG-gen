import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a; int b; String op = "a";
  while(op !== "?"){
    a = scan.next();
    op = scan.next();
    b = scan.next();
    
    if(op == "+") {System.out.println(a + b);}
    else if(op == "-") {System.out.println(a - b);}
    else if(op == "*") {System.out.println(a * b);}
    else if(op == "/") {System.out.println(a / b);}
    }
  }
}