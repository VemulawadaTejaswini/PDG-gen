import java.util.*;

public class Main{

    public static void main(String args[]){

        //配列の宣言
        int[] num = new int[1000000];
        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int s = sc.nextInt();

        int i = 0;
        while(true){
            i++;
            if(num[s-1] == 1){
                break;
            }else{
                num[s-1] = 1;
            }
            if(s % 2 == 0){
                s = s / 2;
            }else{
                s = 3 * s + 1;
            }
        }

        // 出力
        System.out.println(i);

    }

}