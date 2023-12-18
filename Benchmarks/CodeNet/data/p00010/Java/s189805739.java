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
        double[] num;
        double[] PO = new double[2];
        double[] PA = new double[2];
        double[] PB = new double[2];
        double[] PC = new double[2];
        boolean flag = false; // 提出時はfalse
        boolean first = true;

        try {
            while(flag || reader.ready()){
                str = reader.readLine();
                num = getNum(str);

                if (first) {
                    first = false;
                    continue;
                }

                PA[0] = num[0]; PA[1] = num[1];
                PB[0] = num[2]; PB[1] = num[3];
                PC[0] = num[4]; PC[1] = num[5];

                PO = solveSimultaneousEquation(
                    makeVerticalBisector(PA, PB),
                    makeVerticalBisector(PA, PC)
                );

                System.out.println(String.format("%.3f %.3f %.3f", PO[0], PO[1], Distance(PO, PA)));

                flag = false;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //private static int[] getNum(String str){
    private static double[] getNum(String str){
        String[] data = str.split(" "); 

        /*
        int[] num = new int[data.length];
        for (int i = 0; i < data.length; i++){
            num[i] = Integer.parseInt(data[i]);
        }
        */

        double[] num = new double[data.length];
        for (int i = 0; i < data.length; i++){
            num[i] = Double.parseDouble(data[i]);
        }

        return num;
    }

    private static double[] makeVerticalBisector(double[] P, double[] Q){
        // 2点の垂直二等分線を作成

        double[] equation = new double[3];
        // ax + by = c 
        // equation[0] : a, equation[1] : b, equation[2] : c
        // 

        // 中点を求める
        double[] M = new double[2];
        M[0] = (P[0] + Q[0]) / 2;
        M[1] = (P[1] + Q[1]) / 2;

        // 傾きを求める
        // (y1 - y0) x + (x0 - x1) y = c
        // ax + by = c
        // equation[0] = Q[1] - P[1];
        // equation[1] = P[0] - Q[0];
        // equation[2] = equation[0] * M[0] + equation[1] * M[1];
        
        equation[0] = P[0] - Q[0];
        equation[1] = P[1] - Q[1];
        equation[2] = equation[0] * M[0] + equation[1] * M[1];

        return equation;
    }

    private static double[] solveSimultaneousEquation(double[] A, double[] B){
        // 2元連立方程式を解く

        // 入力形式
        // A[0] x + A[1] y = A[2]
        // B[0] x + B[1] y = B[2]

        // ax+by=c
        // dx+ey=f
        
        // x = (ce - bf) / (ae - bd)
        // y = (c - ax) / b = (f - dx) / e

        double a, b, c, d, e, f;
        double ans[] = new double[2];   

        a = A[0]; b = A[1]; c = A[2];
        d = B[0]; e = B[1]; f = B[2];

        ans[0] = ((c * e) - (b * f)) / ((a * e) - (b * d));
        ans[1] = (b != 0) ? (c - a * ans[0]) / b : (f - d * ans[0]) / e;

        return ans;
    }

    private static double Distance(double[] P, double[] Q){
        double distance = 0.0;

        double dx = P[0] - Q[0];
        double dy = P[1] - Q[1];

        distance = Math.sqrt((dx * dx) + (dy * dy));

        return distance;
    }
}
