import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long min = Long.MAX_VALUE;
        long sum = 0;
        for(int i = 0; i<5; i++) {
            min = Math.min(sc.nextLong(), min);
        }
        sum = (long)Math.ceil((double)N/(double)min) + 4;
        System.out.println(sum);
    }
}