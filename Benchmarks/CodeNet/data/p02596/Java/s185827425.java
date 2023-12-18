import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        int seven = 0;
        long ans = -1;
        int mod = 0;
        
        if (k % 2 != 0) {
            for (long i = 1; i < Long.MAX_VALUE; i++) {
                seven = mod * 10 + 7;
                mod = seven % k;
                if (mod == 0) {
                    ans = i;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
