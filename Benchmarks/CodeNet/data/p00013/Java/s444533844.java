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
        int carNum = 0;
        int[] Cars = new int[100];
        
        try {
            while(flag || reader.ready()){
                // データの取得
                num = changeNum(reader.readLine(), DataType);

                // ----- データ処理 ----- //
                switch(num[0]) {
                    case 0  : System.out.println(Cars[--carNum]); break;
                    default : Cars[carNum++] = num[0]; break;
                }
                
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // ----- 自作関数（課題別） ----- //


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
}
