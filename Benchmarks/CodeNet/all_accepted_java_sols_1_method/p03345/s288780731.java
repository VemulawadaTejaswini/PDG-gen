import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int A = sc.nextInt();
        // スペース区切りの整数の入力
        int B = sc.nextInt();
        int C = sc.nextInt();
        long K = sc.nextLong();
        if(K%2==0){
            //偶数
            System.out.println(A-B);
        }else{
            System.out.println(B-A);
        }
        
        // 文字列の入力
        //String s = sc.next();
        // 出力

        
    }
}