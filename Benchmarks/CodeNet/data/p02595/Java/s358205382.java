import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = Integer.parseInt(sc.next());
       int d = Integer.parseInt(sc.next());
       long x,y;
       int count = 0;
       List<String> list = new ArrayList<>();
       for(int i=0; i<n; i++) {
           x = Integer.parseInt(sc.next());
           y = Integer.parseInt(sc.next());
           String xy = String.valueOf(x)+String.valueOf(y);
           if(Math.sqrt(x*x+y*y) <= d) {
            count++;
           }
           
       }
       System.out.println(count);
    }
}
