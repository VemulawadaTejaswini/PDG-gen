import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long d = in.nextInt();
        long d2 = d * d;
        int count = 0;
        for(int i=0; i<n; i++) {
            long x = in.nextLong();
            long y = in.nextLong();
            if(d2 >= x*x + y*y) {
                count++;
            }
        }
        System.out.println(count);
    }
}
