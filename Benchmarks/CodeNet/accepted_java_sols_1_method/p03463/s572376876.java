import java.util.Scanner;
public class Main{
 public static void main(String args[]){
  boolean flag=false;
  Scanner scan=new Scanner(System.in);
  String s;

  s=scan.next();
  double n=Long.parseLong(s);
  s=scan.next();
  double a=Long.parseLong(s);
  s=scan.next();
  double b=Long.parseLong(s);

  if(Math.abs(a-b)%2==0)System.out.println("Alice");
  else System.out.println("Borys");
 }
}
