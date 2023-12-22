import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    sc.close();
    int ans = (c-(a-b))>0 ? c-(a-b) : 0;
    System.out.println(ans);
  }
}