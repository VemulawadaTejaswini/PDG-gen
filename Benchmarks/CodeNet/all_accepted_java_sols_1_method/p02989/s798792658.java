import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ｎは偶数
        int n = sc.nextInt();
        int[] d = new int[n];
        int[] d2 = new int[n];
        int count =0;
        //格納
        for(int i=0; i < n; i++){
            d[i] = sc.nextInt();
            d2[i] = d[i];
        }

        //sort
        Arrays.sort(d2);
//        for(int h=0; h < n ;h++) {
//            System.out.print(d[h]);
//            System.out.println(d2[h]);
//        }
      //  真ん中の数字の判定
        int std = d2[(n/2)-1]+1;
        int std2 = d2[n/2];

            System.out.println(std2 - std+1 );

//        int ans = 0;
//        //判定
//        two: for(int l = std; l < d2[n-1]; l++) {
//            count =0;
//            for (int k = 0; k < n; k++) {
//                if (d2[k] < l) {
//                    count++;
//                }
//            }
//
//            if (count == n / 2) {
//                ans ++;
//                continue two;
//            } else if(count > n/2){
//                break two;
//
//            }
//        }
//        //出力
//        System.out.println(ans);
    }
}

