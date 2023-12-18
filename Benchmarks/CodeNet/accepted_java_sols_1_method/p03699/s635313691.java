import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] s = new Integer[n];
        long sum = 0;
        for(int i = 0;i < n;i++) {
            s[i] = sc.nextInt();
            sum += s[i];
        }
        Arrays.sort(s);
        
        /*
         * 10の倍数を引いても意味がないので、
         * 10の倍数以外の数値を引く。
         */
        long ans = 0;
        for(int i = 0;i < n;i++) {
            if(sum % 10 != 0) {
                ans = sum;
                break;
            }
            else if(s[i] % 10 != 0){
                sum -= s[i];
            }
        }
        
        System.out.println(ans);
    }

}
