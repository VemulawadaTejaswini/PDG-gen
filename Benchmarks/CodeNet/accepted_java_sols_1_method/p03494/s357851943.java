import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1000000009;
        for(int i = 0;i < n;i++){
            int a = sc.nextInt();
            int cnt = 0;
            while(a > 0 && a%2 == 0){
                a /= 2;
                cnt++;
            }
            if(ans > cnt)ans = cnt;
        }
        System.out.println(ans);
    }
}