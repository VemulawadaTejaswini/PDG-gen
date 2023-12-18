import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        double[] a = new double[n+1];
        for(int i = 1; i <= n; i++){
            double tmp = scanner.nextDouble();
            a[i] = tmp * (tmp + 1.0) / 2.0 /tmp + a[i-1];
        }
        double max = 0.0;
        for(int i = 0; i <= n-k; i++){
            double cur = a[i+k] - a[i];
            if(cur > max){max = cur;}
        }
        System.out.println(max);
    }
}

