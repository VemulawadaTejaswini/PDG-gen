import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;
        if(a <= k){
            ans += a;
            if(k-a >= b){//aを使い切った後まだ使えるならb
                //bを使えるだけ使う
                if(k-a-b >= c){//bも使い切って、残りの枚数がcより少なければ
                    ans -= c;
                }else{//cの方が多ければ
                    ans -= k-a-b;//全部使い切る
                }
            }else{
                //bで使い切って終わり
            }
        }else{//aだけで終わるなら
            ans += k;
        }
        System.out.println(ans);
    }
}
