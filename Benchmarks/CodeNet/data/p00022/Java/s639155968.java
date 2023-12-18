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
        boolean flag = false; // 提出時はfalse
        boolean first = true;
        
        int n = 0;
        int total = 0;
        int max = -100000;
        int[] list = null;

        try {
            while(flag || reader.ready()){
                str = reader.readLine();
                num = getNum(str);

                if (first) {
                    list = new int[n = num[0]];
                    max = -100000;
                    first = false;
                    continue;
                }

                list[--n] = num[0];
                total = 0;

                for (int i = n; i < list.length; i++){
                    max = (total += list[i]) > max ? total : max;
                }

                if(n == 0) {
                    System.out.println(max);
                    first =true;
                }


            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[] getNum(String str){
    //private static double[] getNum(String str){
        String[] data = str.split(" "); 

        
        int[] num = new int[data.length];
        for (int i = 0; i < data.length; i++){
            num[i] = Integer.parseInt(data[i]);
        }
        

        /*
        double[] num = new double[data.length];
        for (int i = 0; i < data.length; i++){
            num[i] = Double.parseDouble(data[i]);
        }
        */

        return num;
    }
}
