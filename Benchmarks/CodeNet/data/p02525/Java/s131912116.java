import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // ?¨??????\??????????????????????????????????????????                                    
        Scanner sc = new Scanner(System.in); while (true) {
            int n = sc.nextInt();
            if (n == 0) { break; }
            int[] scores = new int[n];
            double sum = 0, sum1 = 0;
            for (int i = 0; i < scores.length; i++) {
                scores[i] = sc.nextInt(); }
            double average = 0, variance = 0;
            // ... ?????????average??¨,?????£variance????¨????????????? ... System.out.prin\
tln(Math.sqrt(variance));                                                       
            for(int i = 0; i < scores.length; i++){
                sum = scores[i] + sum;
            }
 average = sum / n;
 for(int i = 0; i < scores.length; i++){
     sum1  = (scores[i] - average)*(scores[i] - average) + sum1;
 }
 variance = sum1 / n;
 System.out.println(Math.sqrt(variance));
        }
    }
}