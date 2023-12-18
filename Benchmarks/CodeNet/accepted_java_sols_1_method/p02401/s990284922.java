import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
    int a=sc.nextInt();
    String c=sc.next();
    char op=c.charAt(0);
    int b=sc.nextInt();
      if(op=='?') break;
      if(op=='+') System.out.println(a+b);
      else if(op=='-') System.out.println(a-b);
      else if(op=='*') System.out.println(a*b);
      else if(op=='/') System.out.println(a/b);
    }
     sc.close();
  }
}
