import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        double[] l = new double[n];
        for(int i = 0; i < n; i++){
            l[i] = (sc.nextDouble() + 1) / 2;
        }

        double max = 0;
        for(int i = 0; i < k; i++){
            max += l[i];
        }
        double sum = max;
        for(int i = 0; i < n - k; i++){
            sum = sum - l[i] + l[k + i];
            max = Math.max(max, sum);
        }

        System.out.println(max);
        sc.close();
    }
}