import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] x = new double[n];
        double[] y = new double[n];

        for(int i = 0;i < n;i++){
            x[i] = sc.nextDouble(); 
        }

        for(int i = 0;i < n;i++){
            y[i] = sc.nextDouble(); 
        }

        double tmp,d = 0;
        //p = 1
        for(int i = 0;i < n;i++){
            if(x[i] - y[i] < 0) tmp = -(x[i] - y[i]);
            else    tmp = x[i] - y[i];
            d += tmp;
        }
        System.out.printf("%.8f\n",d);
        //p = 2
        d = 0;
        for(int i = 0;i < n;i++){  
            d += (x[i] - y[i]) * (x[i] - y[i]);
        }
        System.out.printf("%.8f\n",Math.sqrt(d));
        //p = 3
        d = 0;
        for(int i = 0;i < n;i++){
            if(x[i] - y[i] < 0) tmp = -(x[i] - y[i]);
            else    tmp = x[i] - y[i];
            d += (tmp * tmp * tmp);
        }
        System.out.printf("%.8f\n",Math.cbrt(d));
        //p = ∞
        double max = Double.MIN_VALUE;
        for(int i = 0;i < n;i++){
            if(i == 0){
                max = x[i] - y[i];
                if(max < 0) max = -max;
            }
            else{
                tmp = x[i] - y[i];
                if(tmp < 0) tmp = -tmp;
                if(tmp > max)   max = tmp;
            }
        }
        System.out.printf("%.8f\n",max);


    }
}
