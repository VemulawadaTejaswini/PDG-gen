/*
atcoder regular contest 100
解答

配列から最大値と最小値を抜き出す
*/

import java.util.*;
public class Main{

    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = sc.nextInt();
        int min = max;

        for(int i = 0;i < n-1;i++){//ループを回して最大値最小値を取得してしまう
          int temp = sc.nextInt();
          max = Math.max(max,temp);
          min = Math.min(min,temp);
        }


        System.out.println(max-min);
    }
}
