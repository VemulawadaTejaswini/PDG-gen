
import java.util.Scanner;

public class Main {
    static long longNum = 1000000000000000000L;

    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    public static void main(String[] args) {
        long ans = sc.nextLong();
        boolean flg = false;
        try{
            for (int i = 0; i < n - 1; i++){
                ans *= sc.nextLong();
                if (ans > longNum) {
                    System.out.println(-1);
                    flg = true;
                    break;
                }
            }
            if (!flg){
                System.out.println(ans);
            }
        } catch (Exception e){
            System.out.println(-1);
        }
    }
}
