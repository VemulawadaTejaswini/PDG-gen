import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int ans = 0;
        for(int i = 1; i <= N; i++){
            //数字iの各桁の和を算出
            int tmp = i;
            int sum = 0;
            while(tmp > 0){
                sum += tmp % 10;
                tmp /= 10;
            }
          	//数字iの各桁の和がA以上B以下ならば加算
            if(sum >= A && sum <= B) ans += i;
        }
        System.out.println(ans);
    }
}
