
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        ArrayList<Long> p = new ArrayList<>();
        ArrayList<Long> m = new ArrayList<>();
        int plus = 0, minus = 0, zero = 0;
        int a;
        for(int i=0;i<n;i++){
            a = sc.nextInt();
            if(a == 0){
                zero++;
            }else if(a > 0){
                p.add((long)a);
                plus++;
            }else{
                m.add((long)a);
                minus++;
            }
        }
        Collections.sort(p);
        Collections.sort(m);
        if(zero != 0 && k > plus + minus) {   //0が絶対に入るとき
            System.out.println(0);
        }else if(k == plus + minus){
            if(minus % 2 == 1 && zero != 0){
                System.out.println(0);
            }else {     //全部掛けていいケース
                long ans = 1;
                for(Long pl : p){
                    ans *= pl;
                    ans %= 1000000007;
                }
                for(Long mn : m){
                    ans *= mn;
                    ans %= 1000000007;
                }
                ans += 1000000007;
                ans %= 1000000007;
                System.out.println(ans);
            }
        }else if(p.size() == 0){    //正の数がない時
            long ans = 1;
            if(k % 2 == 1) {    //奇数回掛けると負になるので小さい順に
                for (int i = 0; i < k; i++) {
                    ans *= m.get(m.size() - 1 - i);
                    ans %= 1000000007;
                }
            }else{      //偶数回掛けると正になるので大きい順に
                for (int i = 0; i < k; i++) {
                    ans *= m.get(i);
                    ans %= 1000000007;
                }
            }
            ans += 1000000007;
            ans %= 1000000007;
            System.out.println(ans);
        }else{
            long ans = 1;
            if(k % 2 == 1){     //奇数回掛ける時、正の数のうち最大のものは必ず使う
                ans *= p.get(p.size()-1);
                p.remove(p.size()-1);
                k--;
            }
            if(k != 0) {
                long plustime = p.get(p.size() - 1) * p.get(p.size() - 2), minustime = m.get(0) * m.get(1);
                int x = 1, y = 0;
                for (int i = 0; i < k / 2; i++) {
                    if (minustime == 0 || (plustime > 0 && plustime > minustime)) {
                        ans *= p.get(p.size() - x);
                        x++;
                        ans %= 1000000007;
                        ans *= p.get(p.size() - x);
                        x++;
                        ans %= 1000000007;
                        if (p.size() > x + 1) {
                            plustime = p.get(p.size() - x) * p.get(p.size() - x - 1);
                        } else {
                            plustime = 0;
                        }
                    } else {
                        ans *= m.get(y);
                        y++;
                        ans %= 1000000007;
                        ans *= m.get(y);
                        y++;
                        ans %= 1000000007;
                        if (m.size() > y + 1) {
                            minustime = m.get(y) * m.get(y + 1);
                        } else {
                            minustime = 0;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
