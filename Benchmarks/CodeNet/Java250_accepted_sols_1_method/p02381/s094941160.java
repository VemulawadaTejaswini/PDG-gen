import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            int[] test = new int[n];
            double[] tmp = new double[n];

            if(n == 0)  break;

            double sum = 0;
            for(int i = 0;i < n;i++){
                test[i] = sc.nextInt();
                sum += test[i];
            }
            double avg = (double)sum / n;
            
            sum = 0;
            for(int i = 0;i < n;i++){
                sum += (test[i] - avg) * (test[i] - avg);
            }

            System.out.printf("%.8f\n",Math.sqrt(sum / n));
        }
    }
}
