import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] x = new double[n];
        double[] y = new double[n];
        for(int i = 0; i < n; i++){
            x[i] = sc.nextDouble();
        }
        for(int i = 0; i < n; i++){
            y[i] = sc.nextDouble();
        }
        double[] result = new double[4];
        for(int i = 0; i < 4; i++){
            result[i] = 0.0;
        }
        for(int i = 0; i < n; i++){
            double sub = Math.abs(x[i] - y[i]);
            result[0] += sub;
            result[1] += Math.pow(sub, 2.0);
            result[2] += Math.pow(sub, 3.0);
            result[3] = Math.max(result[3], sub);
        }
        result[1] = Math.pow(result[1], 1.0 / 2.0);
        result[2] = Math.pow(result[2], 1.0 / 3.0);

        for(int i = 0; i < 4; i++){
            System.out.println(result[i]);
        }
    }
}

