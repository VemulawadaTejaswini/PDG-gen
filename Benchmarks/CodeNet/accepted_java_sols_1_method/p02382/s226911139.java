import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(6);
        nf.setGroupingUsed(false);
        int vector = Integer.parseInt(br.readLine());
        String[] tmpx1 = br.readLine().split(" ");
        String[] tmpy1 = br.readLine().split(" ");
        double[] vecx1 = new double[vector];
        double[] vecy1 = new double[vector];
        for(int i=0;i<vector;i++) {
            vecx1[i] = Double.parseDouble(tmpx1[i]);
            vecy1[i] = Double.parseDouble(tmpy1[i]);
        }
        double p1 = 0;//p1の答え
        double p2 = 0;
        double p3 = 0;
        double pin = 0;
        double pinmax = 0;
        double tmp = 0;
        //p1
        for(int i=0;i<vector;i++){
            p1 += Math.abs(vecx1[i]-vecy1[i]);
            p2 += Math.pow(Math.abs(vecx1[i]-vecy1[i]),2);
            p3 += Math.pow(Math.abs(vecx1[i]-vecy1[i]),3);
            tmp = Math.abs(vecx1[i]-vecy1[i]);
            if(pinmax < tmp) pinmax = tmp;
        }
        p2 = Math.sqrt(p2);
        p3 = Math.cbrt(p3);
        System.out.println(nf.format(p1));
        System.out.println(nf.format(p2));
        System.out.println(nf.format(p3));
        System.out.println(nf.format(pinmax));
    }
}