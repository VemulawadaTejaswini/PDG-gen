import java.util.*;

public class Main {
  
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String A = sc.next();
      String B = sc.next();
      String C = sc.next();

      char[] a = A.toCharArray();
      char[] b = B.toCharArray();
      char[] c = C.toCharArray();
     
  
      if(a[a.length-1] != b[0]){
          System.out.println("NO");
      }else if(b[b.length-1] != c[0]){
          System.out.println("NO");
      }else{
          System.out.println("YES");
      }
    }
}