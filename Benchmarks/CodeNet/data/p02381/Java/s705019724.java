import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double[] std = new double[100];
        int cnt=0;
        double sum=0;
        double mean;
        while(true){
            int n;
            n = sc.nextInt();
            if(n == 0)
                break;
            sum=0;
            mean=0;
            double[] s = new double[n];
            for(int i=0; i<n; i++){
                s[i] = sc.nextInt();
                sum += s[i];
            }
            mean = sum/n;
            sum = 0;
            for(int i=0; i<n; i++){
                sum += Math.pow((s[i] - mean), 2); 
            }
            mean = sum/n;
            std[cnt] = Math.sqrt(mean);
            cnt++;
        }

        for(int i=0; i<cnt; i++){
            System.out.printf("%.8f\n", std[i]);
        }

        sc.close();
    }
}
