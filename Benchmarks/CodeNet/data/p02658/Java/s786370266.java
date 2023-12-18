import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long sum = 1;
        long ans = 0;
        for(int i=0; i<N; i++) {
            long next = Long.parseLong(sc.next());
            if(next == 0) {
                sum = 0;
                break;
            }
            if(1000000000000000000L / next < sum) {
                sum = -1;
                break;
            }else {
                sum *= next;
            }
        }
        System.out.println(sum);
        
    }
}
