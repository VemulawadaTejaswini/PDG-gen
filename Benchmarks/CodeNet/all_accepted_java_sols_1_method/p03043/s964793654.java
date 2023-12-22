import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        // スペース区切りの整数の入力
        int k = sc.nextInt();
        double answer = 0.0;
        for(int i = 1; i < n + 1; i++){
            if(i < k){
                answer += 1.0 / n * Math.pow(1.0 / 2.0, (Math.ceil(Math.log(((double)k / i)) / Math.log(2))));
                //System.out.println(Math.ceil(Math.log(k / i) / Math.log(2)) + " " + ((double)k / i));
            }else{
                answer += 1.0 / n;
                //System.out.println(answer);
                //answer += 1.0 / n * (n - k);
                //break;
            }
        }

        // 出力
        System.out.println(answer);

    }

}