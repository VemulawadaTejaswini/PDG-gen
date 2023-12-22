import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean b = false;
        while(true){
        if(cal(x)) break;
        x++;
        }
        System.out.println(x);
    }
    public static boolean cal(int n){
    // nが1以下ならfalse
    if(n<=1){
        return false;
    }
    // nが2または3ならtrue
    if(2==n || 3==n){
        return true;
    }
    // nが2の倍数ならfalse
    if(0==n%2){
        return false;
    }
    // nの平方根を整数で取得(5なら2, 10なら3)
    int square_root = (int)Math.sqrt((double)n);
    // nがnの平方根以下の、3以上の奇数(3,5,7,9,11,...)で1回でも割れたらfalse
    for(int i=3; i<=square_root; i+=2){
        if(0==n%i){
            return false;
        }
    }
    // 上記すべて回避したらtrue
    return true;
    }
}
