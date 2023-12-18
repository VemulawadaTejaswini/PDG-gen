import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int v = sc.nextInt();

        int b = sc.nextInt();
        int w = sc.nextInt();

        int t = sc.nextInt();

        String out = "NO";

        
        if(v > w) {
          int speedDiff = v-w;
          int posDiff = b-a;
          
          if(posDiff/speedDiff <= t) out = "YES";
        }
        
        System.out.println(out);
    }
}
