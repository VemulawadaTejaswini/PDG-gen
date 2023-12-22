import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int r=(a>b?a:b)>c?(a>b?a:b):c;
    System.out.println(r*10+a+b+c-r);
  }
}