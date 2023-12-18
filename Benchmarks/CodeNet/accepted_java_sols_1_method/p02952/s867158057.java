import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      String s;
      int count = 0;

      for (int i = 1;i<=a ;i++ ) {
        s = String.valueOf(i);
        if(s.length()%2==0){
          count++;
        }
      }
      System.out.println(a-count);
}
}
