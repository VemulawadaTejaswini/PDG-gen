import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for(long k = 1; k <= n; k++){
            sum += calc(k);
        }System.out.println(sum);
    }

    public static long num(long k){
        long i = 0;
        int num = 0;
        for(i = 1; i <= k; i++){
            if(k%i == 0){
                num++;
            }
        }
        return num;
    }

    public static long calc(long k){
        long ans = k * num(k);
        return ans;
    }
}
