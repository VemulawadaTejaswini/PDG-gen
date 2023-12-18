import java.util.*;
import java.text.*;
class A0004{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                while(sc.hasNext()){
                        int[] a2f = new int[6];
                        for(int i = 0 ; i < 6 ; i++){
                                a2f[i] = sc.nextInt();
                        }   
                        System.out.println(makeOutput(solve(a2f)));
                }   
                sc.close();
        }   
        static String makeOutput(double[] xy){
                DecimalFormat df = new DecimalFormat();
                df.applyPattern("0");
                df.setMaximumFractionDigits(3);
                df.setMinimumFractionDigits(3);
                return df.format(new Double(xy[0])) + " " + df.format(new Double(xy[1]));
        }   
        static double[] solve(int[] a2f){
                double[] xy = new double[2];
                for(int i = 0 ; i < 2 ; i++){
                        xy[i] = (double)1000*(a2f[4-i]*a2f[2]-a2f[5]*a2f[1-i])/(a2f[0]*a2f[4]-a2f[1]*a2f[3]);
                }   
                xy[0] = (double)Math.round(xy[0])/1000;
                xy[1] = (double)Math.round(xy[1])/(-1000);
                return xy; 
        }   
}