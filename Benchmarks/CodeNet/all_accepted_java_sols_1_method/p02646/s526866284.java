import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = Long.parseLong(sc.next());
        long v = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long w = Long.parseLong(sc.next());
        long t = Long.parseLong(sc.next());  
        if((v-w) <= 0) {
            System.out.println("NO");
        }else if(Math.abs(a-b) <= (v-w)*t) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
     }
}