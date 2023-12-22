import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 100;

        while(true){
        n = sc.nextInt();
        if(n==0) break;
        double s[] = new double[n];
        double m, sum = 0d, sum2 = 0d;
        double result;

        for(int i=0; i<n; i++){
            s[i] = (double)sc.nextInt();
            sum += s[i]; 
        }
        m = sum / n;

        for(int i=0; i<n; i++){
            sum2 += Math.pow(s[i]-m, 2);
        }
        result = Math.sqrt(sum2/n); 

        System.out.printf("%.8f\n", result);
    }
    }
}
