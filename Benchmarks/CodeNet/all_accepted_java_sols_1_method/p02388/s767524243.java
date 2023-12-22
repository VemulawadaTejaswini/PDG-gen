import java.util.Scanner;

/**
 * Created by hiroshi on 2017/05/16.
 */
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double n = sc.nextInt();
   
    double n3 = Math.pow(n,3);//pow???double?????§????????????????????????
    int ans = (int)n3;

    System.out.println(ans);
  }
}