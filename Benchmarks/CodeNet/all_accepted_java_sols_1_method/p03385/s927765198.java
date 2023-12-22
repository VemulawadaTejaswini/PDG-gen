import java.util.*;
public class Main {
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      char[] array = str.toCharArray();
      Arrays.sort(array);
      String ans = "Yes";
      char[] abc = {'a','b','c'};
      for (int i=0; i<3; i++) {
        if (array[i] != abc[i])
          ans = "No";
      }
      System.out.println(ans);
    }
}