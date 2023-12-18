import java.util.Scanner;

public class Main{
    public static void main(String[]arg){

        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n == 0) break;
            int[] s = new int[n];

            int sum = 0;

            for(int i =0; i < n; i++){
                s[i] = sc.nextInt();
                sum = sum + s[i];
            }
            double ave = 0, var = 0;

            ave = sum / (double)n;

            double sum2 = 0;

            for(int k = 0; k < n; k++){
                sum2 = sum2 + (s[k] - ave) * (s[k] - ave);
            }

            var = sum2 / (double)n;

            System.out.printf("%.8f\n",Math.sqrt(var));

        }

    }
}
