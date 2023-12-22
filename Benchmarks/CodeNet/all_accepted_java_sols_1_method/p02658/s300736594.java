import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean overflow = false;
        long value = 1;
        long threshold = 1000000000;
        threshold *= 1000000000;
        for(int i=0; i<n; i++) {
            long a = in.nextLong();
            double logv = Math.log10(value);
            double loga = Math.log10(a);
            double logsum = logv + loga;
            if(logsum > 18.0) {
                overflow = true;
            }
            else if(value * a > threshold) {
                overflow = true;
            }
            if(a == 0) {
                overflow = false;
            }
            value = value * a;
        }
        System.out.println(overflow ? -1 : value);
    }
}
