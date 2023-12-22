
import java.util.*;

public class Main {

    /* チェックリスト
     * intの範囲を超えていないか
     * TLEしそうな処理の有無
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] ins = sc.nextLine().split(" ");
        int a = Integer.parseInt(ins[0]);
        int b = Integer.parseInt(ins[1]);
        if(a <= 9 && b <= 9){
            System.out.println(a * b);
        }else{
            System.out.println(-1);
        }
    }
}