import java.util.Scanner;

// 14
class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long tmp;
        n -= (n / k) * k;
        while(true) {
            tmp = n;
            n = Math.abs(n - k);
            if(tmp < n) break;
        }

        System.out.println(tmp);
    }

}
