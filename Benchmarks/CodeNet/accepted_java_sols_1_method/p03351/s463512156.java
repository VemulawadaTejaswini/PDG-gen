import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    boolean answer=true;
    int d1=a-c;
    int d2=a-b;
    int d3=b-c;
    if(d1<0)
    d1 = -d1;
    if(d2<0)
    d2 = -d2;
    if(d3<0)
    d3 = -d3;


    if(d1<=d||(d2<=d&&d3<=d))
    System.out.print("Yes");
    else
    System.out.print("No");
  }
}
