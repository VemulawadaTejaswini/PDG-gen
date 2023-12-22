import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int blank = a-b;
      if(blank>c){
        System.out.println(0);
        System.exit(0);
      }
      System.out.println(c-blank);
  }
}

