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
        //int[] num;
        //int DataType = DATA_TYPE_INTEGER;
        double[] num;
        double DataType = DATA_TYPE_DOUBLE;
        boolean flag = false; // 提出時はfalse

        // ----- 課題別変数 ----- //
        double[] point1;
        double[] point2;
        double[] point3;
        double[] pointP;
        double[] cross = new double[3];
        String PointInTriangle;
        
        try {
            while(flag || reader.ready()){
                // データの取得
                num = changeNum(reader.readLine(), DataType);

                // ----- データ処理 ----- //
                // 各点に分ける
                point1 = extractList(num, 0, 2);
                point2 = extractList(num, 2, 4);
                point3 = extractList(num, 4, 6);
                pointP = extractList(num, 6, 8);

                cross[0] = computeCross(vector(point1, point2), vector(pointP, point1));
                cross[1] = computeCross(vector(point2, point3), vector(pointP, point2));
                cross[2] = computeCross(vector(point3, point1), vector(pointP, point3));

                PointInTriangle = (cross[0] * cross[1] > 0) &&  (cross[0] * cross[2] > 0) ? "YES" : "NO";

                System.out.println(PointInTriangle);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // ----- 自作関数（課題別） ----- //
    private static double[] vector(double[] pointA, double[] pointB) {
        double[] vec = new double[2];
        vec[0] = pointA[0] - pointB[0];
        vec[1] = pointA[1] - pointB[1];
        return vec;
    }

    private static double computeCross(double[] vectorA, double[] vectorB){
        double cross = vectorA[0] * vectorB[1] - vectorA[1] * vectorB[0];
        return cross;
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
}
