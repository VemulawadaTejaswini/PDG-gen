import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input K X
        // X - K + 1 ～ X + K - 1 の値を連続して出力する。
        Scanner sc = new Scanner(System.in);
        int numK = sc.nextInt();
        int numX = sc.nextInt();
        int initNum = numX - numK + 1;
        String retStr = "" + initNum;
        for(int i = initNum + 1; i < numX + numK; i++){
            retStr = retStr + " " + i;
        }
        System.out.println(retStr);
    }
}
