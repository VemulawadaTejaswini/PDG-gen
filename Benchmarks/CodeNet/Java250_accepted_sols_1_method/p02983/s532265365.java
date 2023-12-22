import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        if(r - l >= 2019){
            System.out.println(0);
            return;
        }
        long ans = Long.MAX_VALUE;
        for(long i = l; i < r; i++){
            for(long j = i + 1; j <= r; j++){
                ans = Math.min(ans,(i * j) % 2019);
            }
        }
        System.out.println(ans);
    }
}