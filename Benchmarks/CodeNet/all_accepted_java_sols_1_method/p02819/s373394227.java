import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int ans = x;

        boolean flag = true;

        while (flag){
            int t = (int)Math.sqrt(ans);
//            System.out.println(t);
            int cnt = 0;
            for (int i=2; i<=t; i++){
                if (ans%i==0){
                    ans++;
                    break;
                }else {
                    cnt++;
                }
            }
            if (cnt==t-1) {
                flag = false;
            }
        }
        System.out.println(ans);

    }
}