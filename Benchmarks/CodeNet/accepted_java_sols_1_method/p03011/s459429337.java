import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int sum = p+q+r;
        sum= (sum-p)<(sum-q)?(sum-p):(sum-q);
        sum= sum<(p+q)?sum:(p+q);
        System.out.println(sum);
            
        // 出力
       
    }
}
