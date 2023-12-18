import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int[] ary = new int[nums];
        boolean flg = true;
        int cnt = 0;
        for(int i = 0; i < nums; i++){
            ary[i] = sc.nextInt();
        }
        while(flg){
            for(int i : ary){
                if(i % 2 == 1){
                    flg = false;
                }
            }
            if(flg == false) break;
            for(int i = 0; i < nums; i++){
                ary[i] /= 2;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}