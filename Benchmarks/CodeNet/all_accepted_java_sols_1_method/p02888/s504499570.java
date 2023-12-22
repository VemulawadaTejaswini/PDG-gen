import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // 宣言
        Scanner sc  = new Scanner(System.in);
        int count = 0;
        // 入力値取得
        int rod = sc.nextInt();
        int lens[] = new int[rod];
        while(sc.hasNext()){
            lens[count] = sc.nextInt();
            count++;
        }
        
        // Arrays.sort(lens);
        // 組み合わせ抽出処a理
        Arrays.sort(lens);
        count = 0;
        for(int i=0;i<lens.length;i++){
            for(int j=i+1;j<lens.length;j++){
                for(int k=j+1;k<lens.length;k++){
                    if( (lens[i] < (lens[j] + lens[k])) && (lens[j] < (lens[k] + lens[i])) && (lens[k] < (lens[i] + lens[j])) ){
                        count++;                        
                    }
                    
                }
            }
        }
        System.out.println(count);
    }
}
