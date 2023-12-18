import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x= sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        int ans = 0;
        boolean flag = false;
        for(int i = 0; i < N; i++){
            //飴が全て配れないかつぴったり配れたときの例外処理
            if(x == a[i]){
                ans++;
                flag = true;
                break;
            }
            //飴が全て配れなかった時ansを-1しないための例外処理
            else if(x < a[i]){
                ans++;
                break;
            }
            else{
                x -= a[i];
                ans++;
            }
        }

        if(flag) System.out.println(ans);
        //全て配れて飴が余った時はans-1
        else System.out.println(ans - 1);

    }
}
