
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int scarfs[] = new  int[n];
       int res = 0;
       for(int i = 0; i < n; i++) {
           scarfs[i] = s.nextInt();
           res ^= scarfs[i];
       }
       for(int i =0; i < n ; i++) {
           System.out.println(res^scarfs[i]);
       }
   }
}
