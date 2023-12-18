import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.lang.Math;

class Main{
    private static int[] PrimeNumber = new int[1000000];
    private static int p;

    public static void main(String[] args){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        
        String str;
        int[] num;

        p = 0;
        int N = 1000000;
        int[] cntList = cntPrimeNumber(N);
        try {
            while(reader.ready()){
                str = reader.readLine();
                num = getNum(str);
                System.out.println(cntList[num[0]]);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[] cntPrimeNumber(int N) {
        int cnt = 0;
        int[] cntList = new int[N+1];


        PrimeNumber[0] = 0;
        PrimeNumber[1] = 0;

        for(int i = 2; i < N+1; i++) {
            if (judgePrimeNumber(i)) {
                cnt++;
            }
            cntList[i] = cnt;
        }

        return cntList;
    }

    private static boolean judgePrimeNumber(int n){
        if (n == 2) {
            PrimeNumber[p++] = n;
            return true;
        }
        else {
            int m = (int) Math.sqrt(n);
            for (int i = 0; PrimeNumber[i] <= m; i++) {
                if (n % PrimeNumber[i] == 0) {
                    return false;
                }
            }
            PrimeNumber[p++] = n;
            return true;
        }
    }

    private static int[] getNum(String str){
        String[] data = str.split(" "); 
        int[] num = new int[data.length];

        for (int i = 0; i < data.length; i++){
            num[i] = Integer.parseInt(data[i]);
        }
        return num;
    }

}
