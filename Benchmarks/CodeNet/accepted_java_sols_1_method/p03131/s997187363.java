import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long k = scan.nextInt(), a = scan.nextInt(), b = scan.nextInt();
        if(b <= a) System.out.println(k+1);
        else {
            long total = 1;
            long yen = 0;
            for(int i = 0; i < k; i++) {
                if(yen > 0) {
                    total += yen * b;
                    yen--;
                }
                else if(total >= a && i < k-1) {
                    total -= a;
                    yen++;
                }
                else total++;
            }
            System.out.println(Math.max(k+1, total));
        }
    }
}
