import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n;
        for (int i=0;i<=n;i++){
            int num = 0;
            int a = i;
            while (a>0){
                num+=a%6;
                a/=6;
            }
            a = n-i;
            while (a>0){
                num+=a%9;
                a/=9;
            }
            if (ans>num)ans=num;
        }
        System.out.println(ans);
    }
}
