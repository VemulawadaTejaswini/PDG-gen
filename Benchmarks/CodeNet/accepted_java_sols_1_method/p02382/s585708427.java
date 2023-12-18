
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] d = new int[n];
        for(int i=0;i<n;i++){
            x[i]=scn.nextInt();
        }
        double dx1=0;
        double dx2=0;
        double dx3=0;
        double max = 0;
        for(int i=0;i<n;i++){
            y[i]=scn.nextInt();
            d[i]=Math.abs(x[i]-y[i]);
            max = Math.max(max,d[i]);

            dx1 +=d[i];
            dx2 +=Math.pow(d[i],2);
            dx3 +=Math.pow(d[i],3);
        }

        double dxy2 = Math.sqrt(dx2);
        double dxy3 = Math.cbrt(dx3);

        System.out.printf("%.6f%n",dx1);
        System.out.printf("%.6f%n",dxy2);
        System.out.printf("%.6f%n",dxy3);
        System.out.printf("%.6f%n",max);

        scn.close();

    }

}
