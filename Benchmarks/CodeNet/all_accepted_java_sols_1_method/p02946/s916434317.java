import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
       int k = scan.nextInt();
       int x = scan.nextInt();
       int bmin, bmax;
       bmin = x-(k-1);
       bmax = x+(k-1);
       for (int i = bmin;i <= bmax ;i++ ) {
           System.out.println(i);
       }
    }
    
}
