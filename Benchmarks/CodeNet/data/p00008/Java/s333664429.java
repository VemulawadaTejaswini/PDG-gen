import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.lang.Math;

class Main{
    public static void main(String[] args){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        
        String str;
        int[] num;
        
        try {
            while(reader.ready()){
                str = reader.readLine();
                num = getNum(str);
                System.out.println(cntIntegers(num[0]));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int cntIntegers(int n) {
        int cnt = 0;

        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 0; d <= 9; d++) {
                        if (a + b + c + d == n) {
                            cnt++;
                        }
                    }
                }
            }
        }

        return cnt;
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
