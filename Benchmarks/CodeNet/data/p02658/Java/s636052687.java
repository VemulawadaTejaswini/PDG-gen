import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long r = 1;
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            r = r * a[i];
            if(r > 1000000000000000000L || r < 0){
                r = -1;
            }
        }
        System.out.println(r);
    }
}