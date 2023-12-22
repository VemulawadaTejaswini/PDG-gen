import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n＋1回飛ぶ
        int x = sc.nextInt();//座標
        int[] L = new int[n];
        int sum = 0;
        int cnt = 0;
        int ans = 1;

        for(int i = 0;i < n;i++){
            L[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++){
            cnt += L[i];
            if(cnt <= x)
            ans++;
        }
        System.out.println(ans);
    }
}