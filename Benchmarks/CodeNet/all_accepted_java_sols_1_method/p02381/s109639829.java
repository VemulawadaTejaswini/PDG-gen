
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(final String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            int n = scanner.nextInt();
            if(n == 0){
                break;
            }
            int[] s = new int[n] ;
            for (int i = 0; i < n; i++){
                s[i] = scanner.nextInt();
            }
            int sum = 0;
            for(int i = 0; i < n; i++){
                sum += s[i];
            }
            double ave = (double)sum / (double)n;
            double sum2 = 0;
            for(int i = 0; i < n; i++){
                sum2 += Math.pow((double)s[i], 2);
            }
            double ave2 = sum2/(double)n;
            double v = ave2 - Math.pow(ave, 2);
            System.out.println(Math.sqrt(v));
        }
        scanner.close();
    }
     
    

}
