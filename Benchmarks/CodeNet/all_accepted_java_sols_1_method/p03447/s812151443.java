import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int kari=x-a;
    kari=kari%b;
    System.out.println(kari);
  }
}