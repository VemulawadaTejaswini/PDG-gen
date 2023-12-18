import java.util.*;

public class Main{
    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int i, sum = 0;
            double a, m, sum2 = 0.0;

            int n = sc.nextInt();
            int score[] = new int[n];

            if(n==0){break;}
            else{
                for(i=0;i<n;i++){
                    score[i] = sc.nextInt();
                    sum += score[i];
                }
                m = (double)(sum / n);

                for(i=0;i<n;i++){
                    sum2 += (double)(score[i] - m)*(score[i] - m);
                }
                a = (double)(sum2 / n);

                System.out.println(Math.sqrt(a));
            }
        }
    }
}
