import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int[] a = new int[9];
        for(int i = 0; i < 9; i++){
            a[i] = sc.nextInt();    
        }
        int[] hit = new int[9];
        int n = sc.nextInt();
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
            for(int j = 0; j < 9; j++){
                if(b[i] == a[j]){
                    hit[j] = 1;
                }
            }    
        }

        // 処理
        String out = "No";
        //横
        for(int i = 0; i < 9; i+= 3){
            if((hit[i] + hit[i+1] + hit[i+2]) == 3){
                out = "Yes";
            }
        }
        //縦
        for(int i = 0; i < 3; i++){
            if((hit[i] + hit[i+3] + hit[i+6]) == 3){
                out = "Yes";
            }
        }
        //斜め
        if((hit[0] + hit[4] + hit[8]) == 3){
            out = "Yes";
        }
        if((hit[2] + hit[4] + hit[6]) == 3){
            out = "Yes";
        }

        // 出力
        System.out.println(out);
    }

}