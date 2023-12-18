import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);


      String a = sc.next();
      String b = sc.next();
      char[] a1 = new char[3];
      char[] b1 = new char[3];
      int j = 2;

      for(int i = 0;i<3;i++){
        a1[i] = a.charAt(i);
        b1[i] = b.charAt(j);
        j--;
      }

      for(int i = 0;i<3;i++){
        if(a1[i]!=b1[i]){
          System.out.println("NO");
          System.exit(0);
        }
      }

        System.out.println("YES");

  }
}
