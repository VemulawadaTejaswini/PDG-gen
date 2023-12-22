import java.util.*;
import java.io.*;

public class Main {
  
 public static void main(String[] args){
    Scanner s = new Scanner(System.in);

        int[] a = new int[3];
        a[0] = s.nextInt();
        a[1] = s.nextInt();
        a[2] = s.nextInt();
        Arrays.sort(a);
        if (a[0] == 5 && a[1]== 5 && a[2] == 7) System.out.println("YES");
        else System.out.println("NO");
  }
}
  
