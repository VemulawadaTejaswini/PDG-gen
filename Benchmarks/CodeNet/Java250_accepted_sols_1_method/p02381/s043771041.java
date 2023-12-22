import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            int[] s = new int[n];
            int sum = 0;
            double ave = 0;
            double a = 0;
            for(int i = 0; i<n; i++){
                s[i] = sc.nextInt();
                sum += s[i];
            }
            ave = (double) sum / n;
            for(int j = 0; j <n; j++){
                a += (double)(s[j] - ave)*(s[j] - ave) / n;
            } 
            double b = Math.sqrt(a);
            System.out.printf("%.8f\n",b);
            n = sc.nextInt();
        }
        sc.close();
    }
    
}
