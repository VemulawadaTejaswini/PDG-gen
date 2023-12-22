import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input N
        // 1 以上 N 以下の整数のうち、桁数が奇数の数の個数を求める
        Scanner sc = new Scanner(System.in);
        int maxNum = sc.nextInt();
        int retNum = 0;
        // maxNum が 1 ～ 8 なら retNum は maxNum
        // maxNum が 9 ～ 99 なら retNum は 9
        // maxNum が 100 ～ 998 なら retNum は 10 + (maxNum - 100)
        // maxNum が 999 ～ 9999 なら retNum は 909
        // maxNum が 10000 ～ なら retNum は 910 + (maxNum - 10000)
        if(maxNum < 9){
            retNum = maxNum;
        } else if(maxNum < 100){
            retNum = 9;
        } else if(maxNum < 999){
            retNum = 10 + maxNum - 100;
        } else if(maxNum < 10000){
            retNum = 909;
        } else if(maxNum < 100000){
            retNum = 910 + maxNum - 10000;
        } else {
            retNum = 90909;
        }
        System.out.println(retNum);
    }
}
