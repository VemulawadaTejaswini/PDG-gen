import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        int ans = -1;
        long bd = 1 % k;
        long pred = 7 % k;
        if(pred != 0){
            for (int i = 2; i < 10000000; i++) {
                bd = bd * 10 % k;
                pred = (pred + bd*7)%k;
                if(pred == 0){
                    ans = i;
                    break;
                }
            }
        }else{
            ans = 1;
        }
        System.out.println(ans);
        sc.close();

    }

}
