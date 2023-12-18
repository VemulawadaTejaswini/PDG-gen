
import java.util.*;

public class Main {

    /* チェックリスト
     * intの範囲を超えていないか
     * TLEしそうな処理の有無
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int in = Integer.parseInt(sc.nextLine());
        float max = in;
        float oddness = 0;
        for(int i = 1;i <= in;i++){
            if(i % 2 != 0){
                oddness++;
            }
        }
        System.out.println(oddness / max);
    }
}