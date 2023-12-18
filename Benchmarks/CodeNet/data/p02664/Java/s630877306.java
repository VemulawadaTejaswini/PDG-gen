
import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        String hoge = sc.next();

        //int countQ = 0;
        hoge = hoge.replace("?", "D");
        System.out.println(hoge);

          /**
        int counQ = 0;
        int positionQ = hoge.indexOf('?');
        while (positionQ != -1) {
            counQ++;
            positionQ = hoge.indexOf('e', positionQ + 1);
          }


          /**
          int countD = 0;
          int positionD = hoge.indexOf('D');
          while (positionD != -1) {
              countD++;
              positionD = hoge.indexOf('D', positionD + 1);
            }

            int countDP = 0;
            int positionDP = hoge.indexOf("DP");
            while (positionDP != -1) {
                countDP++;
                positionDP = hoge.indexOf("DP", positionDP + 1);
              }

              
            int countPQ = 0;
            int positionPQ = hoge.indexOf('D');
            while (positionPQ != -1) {
                countPQ++;
                positionPQ = hoge.indexOf('D', positionDP + 1);
              }

              int countPD = 0;
              int positionPD = hoge.indexOf("DP");
              while (positionDP != -1) {
                    countPD++;
                    positionPD = hoge.indexOf("DP", positionPD + 1);
                }
  


        int H1 = sc.nextInt();
        int M1 = sc.nextInt();
        int H2 = sc.nextInt();
        int M2 = sc.nextInt();
        int K = sc.nextInt();

        int BigH2 = H2-H1;
        int BigH2M2 = BigH2*60+M2;
        int clearTime = BigH2M2-M1;
        int answer = clearTime - K ;
        System.out.println(answer);

/**
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
 
        // 通った街を記録する配列
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);    // 一つ目の町
 
        // ループの先頭の町がリストの何番目にあるかを格納する変数
        int check = -1;
 
        // 転送先を格納する変数。
        int temp = 1;   // 計算のため初期値１
 
        for (long i = 0; i < k; i++) {
            temp = a[temp-1];   //　転送先設定
            // 訪れた町かチェック
            // 訪れていた場合、ループ前のイントロ部分の長さを求める
            if (list.contains(temp)) {
                check = list.indexOf(temp);
            	break;
            }
            list.add(temp);
        }
        if(check == -1){
            System.out.println(temp);
        }else{
 
        // 合計移動回数をループ長で割った余りを求める
        int std = (int)(k-check) % (list.size() - check);
 
        System.out.println(list.get((int)(std + check)));
        }
        **/
    }
}