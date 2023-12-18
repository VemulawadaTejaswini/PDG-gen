import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] xArray = new int[num];
        for(int i = 0; i < num; i++){
            xArray[i] = sc.nextInt();
        }
        int[] yArray = new int[num];
        for(int i = 0; i < num; i++){
            yArray[i] = sc.nextInt();
        }
        
        double[] p = new double[4];
        
        for(int i = 0; i < num; i++){
            double dif = Math.abs(xArray[i] - yArray[i]);
            p[0] += dif;
            p[1] += Math.pow(dif, 2);
            p[2] += Math.pow(dif, 3);
            p[3] = Math.max(p[3], dif);
            
        }
        p[1] = Math.sqrt(p[1]);
        p[2] = Math.cbrt(p[2]);
        
        for(double result: p){
            System.out.println(result);
        }
    }
}
