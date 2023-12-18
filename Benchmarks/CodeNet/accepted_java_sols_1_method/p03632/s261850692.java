import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    if(a<=c&&b<=d&&c<=b){
      System.out.println(b-c);
    }else if(c<=a&&d<=b&&a<=d){
      System.out.println(d-a);
    }else if(a<=c&&a<=d&&b>=c&&b>=d){
      System.out.println(d-c);
    }else if(c<=a&&c<=b&&d>=a&&d>=b){
      System.out.println(b-a);
    }else{
      System.out.println(0);
    }
  }
}
