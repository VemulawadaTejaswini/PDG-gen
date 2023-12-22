import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.cbrt;
import static java.lang.Math.abs;

class Main{
    
    public static void main(String[] arg){

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        int n = Integer.parseInt(input);

        int[] x = new int[n];
        int[] y = new int[n];
        int[] x_y = new int[n];

        input = in.nextLine();
        String [] param_line = input.split(" ", 0);
        for(int i=0; i<x.length; i++){
            x[i] = Integer.parseInt(param_line[i]);
        }

        input = in.nextLine();
        param_line = input.split(" ", 0);
        for(int i=0; i<y.length; i++){
            y[i] = Integer.parseInt(param_line[i]);
        }

        for(int i=0; i<x_y.length; i++)
            x_y[i] = abs(x[i] - y[i]);

        double tmp = 0.0;
        for(int i=0; i<x_y.length; i++){
            tmp += x_y[i];
        }
        double p1 = tmp;
        System.out.printf("%.6f\n",p1);

        tmp = 0.0;
        for(int i=0; i<x_y.length; i++){
            tmp += pow(x_y[i], 2);
        }
        double p2 = sqrt(tmp);
        System.out.printf("%.6f\n",p2);

        tmp = 0.0;
        for(int i=0; i<x_y.length; i++){
            tmp += pow(x_y[i], 3);
        }
        double p3 = cbrt(tmp);
        System.out.printf("%.6f\n",p3);

        tmp = 0.0;
        for(int i=0; i<x_y.length; i++){
            if(tmp<x_y[i]) tmp = x_y[i];
        }
        double pm = tmp;
        System.out.printf("%.6f\n",pm);

    }
}