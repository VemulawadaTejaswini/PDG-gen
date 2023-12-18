import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a=0,b=0,c=0,k=0;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    k=sc.nextInt();
    if(a>b&&b>c)
      System.out.println("NO");
    else
      System.out.println("Yes");
  }
}