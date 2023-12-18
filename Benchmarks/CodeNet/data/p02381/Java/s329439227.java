import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        int i;
        int[] score;
        double m;
        double a;

        while(true){
            n = sc.nextInt();
            int sum = 0;
            double asum = 0.0;

            if(n==0){
                break;
            }

            else{
                score = new int[n];

                for(i=0;i<n;i++){
                    score[i] = sc.nextInt();
                    sum += score[i];
                }

                m = (double) sum / n;

                for(i=0;i<n;i++){
                    asum += (score[i] - m ) * (score[i] - m );
                }

                a = asum / n;
                System.out.printf("%.8f\n",Math.sqrt(a));
            }

        }

        sc.close();

    }

}
