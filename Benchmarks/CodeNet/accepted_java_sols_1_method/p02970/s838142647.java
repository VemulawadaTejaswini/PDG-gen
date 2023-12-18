import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());

        int p = 1 + D;
        int count = 0;
        if ( p < N ) {
            count++;
        } else {
            System.out.println(1);
            System.exit(0);
        }
        
        while (p < (N-D)) {
            p += (2*D+1);
            count++;
        }
            
        System.out.println(count);

    }
}