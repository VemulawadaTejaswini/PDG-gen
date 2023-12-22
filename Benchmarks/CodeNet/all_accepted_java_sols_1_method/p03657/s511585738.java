import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=1/(a+b);
    System.out.println(((a%3==0)||(b%3==0)||((a+b)%3==0))?"Possible":"Impossible");
  }
}
