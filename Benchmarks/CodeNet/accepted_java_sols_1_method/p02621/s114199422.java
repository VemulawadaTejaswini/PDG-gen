import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    a=a+a*a+a*a*a;
    System.out.printf("%d",a);
  }
}