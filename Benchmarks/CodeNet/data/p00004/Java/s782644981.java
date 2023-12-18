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
        boolean firstTime = true;

        String str;
        double[] num;
        double[] xy;
        try {
            while(reader.ready()){
                str = reader.readLine();
                num = getNum(str);
                xy = solveXY(num);
                //System.out.println(xy[0] + " " + xy[1]);
                System.out.println(String.format("%.3f %.3f", xy[0], xy[1]));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double[] getNum(String str){
        String[] data = str.split(" "); 
        double[] num = new double[data.length];

        for (int i = 0; i < data.length; i++){
            num[i] = Double.parseDouble(data[i]);
        }
        return num;
    }

    private static double[] solveXY(double num[]){
        // ax+by=c
        // dx+ey=f

        // x = (bf - ce) / (ae - bd)
        // y = (c - ax) / b = (f - dx) / e

        double[] xy = new double[2];
        double a, b, c, d, e, f;
        
        a = num[0];
        b = num[1];
        c = num[2]; 
        d = num[3];
        e = num[4];
        f = num[5];

        xy[0] = ((c * e) - (b * f)) / ((a * e) - (b * d));
        xy[1] = (c - a * xy[0]) / b;

        xy[0] = Math.round(xy[0] * 1000) * 0.001;
        xy[1] = Math.round(xy[1] * 1000) * 0.001;

        return xy;
    }
}
