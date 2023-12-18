import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.lang.Math;

class Main{
    private final static int    DATA_TYPE_INT = 1;
    private final static double DATA_TYPE_DOUBLE = 2.0;

    public static void main(String[] args){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        
        // 共通変数
        String str;
        //int[] num;
        //int DataType = DATA_TYPE_INT;
        double[] num;
        double DataType = DATA_TYPE_DOUBLE;
        boolean debug = false;

        // 課題別変数
        double[] position = {0, 0};
        int degree = 90;
        double[] direction = {0, 1}; // 初期方向は北

        /*
                N (y)
                ^
                |
        W <-----+-----> E (x)
                |
                v
                S
        */

        try {
            while(debug || reader.ready()){
                str = reader.readLine();

                // [0,0]が入力されたら終了
                if(str.equals("0,0")){
                    System.out.println((int)position[0]);
                    System.out.println((int)position[1]);
                    break;
                }

                // 数値データの取得
                num = getNum(str, DataType);

                // 進む
                position[0] += num[0] * direction[0];
                position[1] += num[0] * direction[1];

                // 次回の進行方向を計算
                degree -= num[1];
                direction[0] = Math.cos(Math.toRadians(degree));
                direction[1] = Math.sin(Math.toRadians(degree));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // ----- 自作関数（共通） ----- //
    
    private static int[] getNum(String str, int DataType){
        String[] data = str.split(" "); 
        int[] num = new int[data.length];

        for (int i = 0; i < data.length; i++){
            num[i] = Integer.parseInt(data[i]);
        }
        return num;
    }

    private static double[] getNum(String str, double DataType){
        String[] data = str.split(","); 
        double[] num = new double[data.length];

        for (int i = 0; i < data.length; i++){
            num[i] = Double.parseDouble(data[i]);
        }
        return num;
    }

}
