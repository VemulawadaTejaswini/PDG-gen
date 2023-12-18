import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.lang.Math;

class Main{

    private final static int DATA_TYPE_INTEGER = 1;
    private final static double DATA_TYPE_DOUBLE = 2.0;
    
    public static void main(String[] args){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        

        // ----- 共通変数 ----- //
        int[] num;
        int DataType = DATA_TYPE_INTEGER;
        //double[] num;
        //double DataType = DATA_TYPE_DOUBLE;
        boolean flag = false; // 提出時はfalse

        // ----- 課題別変数 ----- //
        boolean first = true;
        int[] x = null;
        int[] y = null;
        int[] z = null;
        
        try {
            while(flag || reader.ready()){
                // データの取得
                num = changeNum(reader.readLine(), (long)DataType);


                // ----- データ処理 ----- //
                
                // 初回のみ別処理
                if(first) {
                    first = false;
                    continue;
                } 

                if(x == null) {
                    x = num.clone();
                } else {
                    y = num.clone();
                    z = sum(x, y);
                    
                    if (z.length <= 80) {
                        for (int i = z.length - 1; i >= 0; i--) {
                            System.out.print(z[i]);
                        }
                        System.out.println("");
                    }
                    else{
                        System.out.println("overflow");
                    }

                    x = null;
                    y = null;
                }
                
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // ----- 自作関数（課題別） ----- //
    private static int[] changeNum(String str, long DataType){
        //private static double[] getNum(String str){
        int[] num = new int[str.length()];
        int begin, end;
        for (int i = 0; i < str.length(); i++){
            begin = str.length() - i - 1;
            end = begin + 1;
            num[i] = Integer.parseInt(str.substring(begin, end));
        }    
        return num;
    }

    private static int[] sum(int[] x, int[] y) {
        int[] z = new int[Max(x.length, y.length)];
        boolean move_up = false;
        int i = 0;
        int xi, yi;

        while (i < x.length || i < y.length){
            xi = (i < x.length) ? x[i] : 0;
            yi = (i < y.length) ? y[i] : 0;
            
            z[i] = move_up ? (xi + yi + 1) : (xi + yi);
            move_up = z[i] >= 10 ? true : false;
            z[i] %= 10;

            i++;
        }

        if (move_up) {
            // 最上位に繰り上げがあったとき
            int[] z2 = new int[z.length + 1];
            for (i = 0; i < z.length; i++) {
                z2[i] = z[i];
            }
            z2[i] = 1;

            return z2;
        }
        else {
            return z;
        }
    }

    // ----- 自作関数（共通） ----- //

    private static int[] changeNum(String str, int DataType){
    //private static double[] getNum(String str){
        String[] data = str.split(" "); 
        int[] num = new int[data.length];

        for (int i = 0; i < data.length; i++){
            num[i] = Integer.parseInt(data[i]);
        }

        return num;
    }

    private static double[] changeNum(String str, double DataType){
        String[] data = str.split(" "); 
        double[] num = new double[data.length];

        for (int i = 0; i < data.length; i++){
            num[i] = Double.parseDouble(data[i]);
        }
            
        return num;
    }

    private static int[] extractList(int[] originalList, int begin, int end){
        int[] list = new int[end - begin];
        int p = 0;

        for (int i = begin; i <= end; i++) {
            list[p++] = originalList[i];
        }

        return list;
    }

    private static double[] extractList(double[] originalList, int begin, int end){
        double[] list = new double[end - begin];
        int p = 0;

        for (int i = begin; i < end; i++) {
            list[p++] = originalList[i];
        }

        return list;
    }

    private static void swap(int[] box, int a, int b) {
        int temp = box[a];
        box[a] = box[b];
        box[b] = temp;
    }

    private static void swap(double[] box, int a, int b) {
        double temp = box[a];
        box[a] = box[b];
        box[b] = temp;
    }

    private static int Max(int a, int b) {
        return a > b ? a : b;
    }
 }
