import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in);){
            while(true){
                int n = sc.nextInt();
                if(n== 0)break;
                int[]scores = new int[n];
                int sum=0;
                double sum2=0;
                for(int i=0;i<scores.length;i++){
                    scores[i] = sc.nextInt();
                    sum += scores[i];
                }
                double ave= (double)sum/n,var = 0;
                double[]scores2 = new double[n];
                for(int i=0;i<scores.length;i++){
                    scores2[i] = (scores[i] - ave)*(scores[i] - ave);
                    sum2 += scores2[i];
                }
                var = sum2 /n;
                System.out.println(Math.sqrt(var));
            }
        }
    }
}
