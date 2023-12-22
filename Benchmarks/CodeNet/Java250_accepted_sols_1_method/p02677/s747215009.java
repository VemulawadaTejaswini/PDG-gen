import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String[] input = br.readLine().split(" ");
            double A = Double.parseDouble(input[0]);
            double B = Double.parseDouble(input[1]);
            double H = Double.parseDouble(input[2]);
            double M = Double.parseDouble(input[3]);

            double h_r = 0;
            double m_r = 0;
            double r = 0;
            double result = 0;

            if(M == 0){
              m_r = 360;
              h_r = H * 30;
            }else{
              m_r = M * 6;
              h_r = H * 30 + M * 0.5;
            }

            //System.out.println(h_r);
            //System.out.println(m_r);

            if(H == 0 && M == 0){
              result = A - B;
            }else{
              r = Math.abs(h_r - m_r);
              if(r == 0){
                result = 0;
              }else{
                double cos = Math.cos(Math.toRadians(r));
                double a = Math.pow(A, 2);
                double b = Math.pow(B, 2);
                double tmp = a + b - (2 * A * B * cos);
                result = Math.sqrt(tmp);
              }
            }

            System.out.println(result);
        }

    }
}