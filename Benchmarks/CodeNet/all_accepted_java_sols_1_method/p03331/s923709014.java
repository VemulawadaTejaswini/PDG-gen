import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        long ans = n;
        long sum;
        String a;
        String b;
        long p;

        while(i <= n-i){
            sum = 0;
            a = String.valueOf(i);
            b = String.valueOf(n-i);
            p = Long.valueOf(a+b);

            while(p > 0){
                sum = sum + (p%10);
                p = (p - (p % 10)) / 10;
            }

            if(sum <= ans){
                ans = sum;
            }
            i++;
        }

        System.out.println(ans);
    }
}
