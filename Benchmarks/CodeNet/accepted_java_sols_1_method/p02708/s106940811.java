import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long sum = 0;
        for(long i=k;i<n+2;i++){
            long max = (n + n - i + 1) * i / 2;
            long min = (i-1) * i / 2;
            if(max - min + 1 < 0) {
                System.out.println("abort," + i + ", " + max + ", " + min);
                break;
            }
            sum += max - min + 1;
            if(sum >= 1000000007){
                sum %= 1000000007;
            }
        }

        System.out.println(sum);

    }
}
