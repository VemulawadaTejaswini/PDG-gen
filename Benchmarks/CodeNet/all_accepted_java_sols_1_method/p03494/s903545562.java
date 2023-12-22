import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //入力
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        boolean judge = true;
        int count = 0;
        //条件に合っているときに繰り返す
        while(judge){
            //奇数があるなら止める
            for(int j=0; j<n; j++){
                if(a[j] % 2 == 1){
                    judge = false;
                }
            }
            //割れるなら2で割る
            if(judge){
                //2で割る
                for(int k=0; k<n; k++){
                    a[k] /= 2;
                }
                //割った回数カウントする
                count++;
            }
        }

        System.out.println(count);
    }
}