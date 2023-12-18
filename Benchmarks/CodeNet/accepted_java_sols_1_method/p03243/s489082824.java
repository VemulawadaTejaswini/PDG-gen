import java.util.*;

public class Main {
  static int[] list;
    public static void main(String[] args) throws Exception{
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for (int i = n; i <= 999; i++) {
        char[] a = String.valueOf(i).toCharArray();
        if(a[0] == a[1] &&a[0] == a[2]) {
          System.out.println(i);
          break;
        } 
      }
    }
}