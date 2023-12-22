import java.util.*;

public class Main{
  static int min(int p, int q){return p<q?p:q;}
  public static void main(String[] args){


    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    int c =  n * a;

    System.out.println(min(b,c));
  }
}