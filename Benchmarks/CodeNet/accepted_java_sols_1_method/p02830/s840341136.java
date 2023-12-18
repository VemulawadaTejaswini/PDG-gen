import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      String s = sc.next();
      String t = sc.next();

      char[] sd =new char[n];
      char[] td =new char[n];

      for (int i = 0;i<n ;i++) {
        sd[i] = s.charAt(i);
        td[i] = t.charAt(i);
      }

      for (int i = 0;i<n ;i++) {
        System.out.print(sd[i]);
        System.out.print(td[i]);
      }
      System.out.println();


}
}
