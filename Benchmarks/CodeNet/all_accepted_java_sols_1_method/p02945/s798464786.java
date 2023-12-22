import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();

    int t1=a+b;
    int t2=a-b;
    int t3=a*b;

    int max=Math.max(t1,t2);
    max=Math.max(max,t3);

    System.out.println(max);
  }
}
