import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double tmp;
        n = input.nextInt();
        double[] x = new double[n];
        double[] y = new double[n];
        for (int i = 0; i < n; i++){
            x[i] = input.nextDouble();
        }
        for (int i = 0; i < n; i++){
            y[i] = input.nextDouble();
        }
        for (int i = 0; i < 3; i++){
            tmp = 0;
            for (int j = 0; j < n; j++){
                tmp += Math.pow(Math.abs(x[j] - y[j]),(i+1));
            }
            tmp = Math.pow(tmp,(double)1/(i+1));
            System.out.println(tmp);
        }
        tmp = 0;
        for (int i = 0; i < n; i++){
            tmp = Math.max(tmp,Math.abs(x[i]-y[i]));
        }
        System.out.println(tmp);
    }
}
