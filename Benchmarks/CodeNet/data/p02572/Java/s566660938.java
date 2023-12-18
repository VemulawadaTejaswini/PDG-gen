import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 配列
        int n = sc.nextInt();
        long[] a = new long[n];
        long e = 1000000007L;
        long sum = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            sum += a[i];
            if(sum >= e) {
                sum -= e;
            }
        }
        long ans =0;
        long mul = 0;
        for(int i=0; i<n;i++) {
            if(sum < a[i]) {
                mul = sum + e - a[i];
            } else {
                mul = sum - a[i];
            }

            ans = (ans + (a[i] * mul)) % e;
        }

        if(ans%2 == 0) {
        System.out.println(ans/ 2);
        } else {
            System.out.println((ans + e)/ 2);
        }
    }
   
}

