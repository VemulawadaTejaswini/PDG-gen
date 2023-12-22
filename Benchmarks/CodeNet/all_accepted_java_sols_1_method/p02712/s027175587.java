import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long total = 0;
        for(int i = 1; i <= n; i++) {
            if( i % 3 != 0 && i % 5 != 0) {
                total += (long)i;
            }
        }
        System.out.println(total);
    }
}