import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


class Main{
    public static void main(String[] args){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        boolean firstTime = true;

        String str;
        int[] num;
        try {
            while(reader.ready()){
                str = reader.readLine();
                if (firstTime) {
                    firstTime = false;
                }
                else{
                    num = getNum(str);
                    if (gudgeRightTriangle(num))
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
            }   
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
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

    private static long cntDigit(int num) {
        int n = 1;
        while(num >= 10) {
            n++;
            num /= 10;
        }
        return n;
    }

    private static boolean gudgeRightTriangle(int[] num) {
        Arrays.sort(num);
        
        if ((num[2] * num[2]) == (num[0] * num[0]) + (num[1] * num[1]))
            return true;
        else 
            return false;
    }
}
