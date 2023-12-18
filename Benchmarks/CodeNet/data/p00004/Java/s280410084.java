import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math.*;
import java.util.*;
import java.math.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String readBuffer;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(8);
        nf.setGroupingUsed(false);        
        while( (readBuffer = br.readLine()) != null) {
            String[] line = readBuffer.split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int c = Integer.parseInt(line[2]);
            int d = Integer.parseInt(line[3]);
            int e = Integer.parseInt(line[4]);
            int f = Integer.parseInt(line[5]);
            double[] ans = equation(a,b,c,d,e,f);
            System.out.println(nf.format(ans[0]) + " " + nf.format(ans[1]));
        }
        
    }
    //return double[0];x double[1]:y
    static double[] equation(int a,int b,int c,int d,int e,int f){
        double[] ans = new double[2];
        ans[0] = (c * e - b * f) / (a * e - b * d);
        ans[1] = (f * a - c * d) / (a * e - d * b);
        return ans;
    }
}