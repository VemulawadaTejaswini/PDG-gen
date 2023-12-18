
import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        while(true){
            int n = scan.nextInt();
            if(n == 0)break;
            int scores[] = new int[n];
            int sum = 0;
            for(int i = 0;i < n;i++){
                int j = scan.nextInt();
                sum += j;
                scores[i] = j;
            }
            double average = (double)sum / n;
            double bunsan = 0;
            for(int i = 0;i < n;i++)bunsan += (scores[i] - average)*(scores[i] - average);
            bunsan /= n;            
            double hensa = Math.sqrt(bunsan);
            System.out.printf("%.8f\n", hensa);
        
        }
        scan.close();
    }

    

}
