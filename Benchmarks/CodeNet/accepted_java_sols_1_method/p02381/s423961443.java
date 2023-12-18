import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        try (Scanner sc = new Scanner (System.in)){
            while(true){
                int n = sc.nextInt();
                if(n==0){
                    break;
                }
                int [] scores = new int[n];
                double sum =0;
                for(int i=0;i<scores.length;i++){
                    scores[i]=sc.nextInt();
                    sum += scores[i];
                }
                double ave = sum/n;
                double varp=0;
                double var =0;
                for(int i=0;i<scores.length;i++){
                    varp += (scores[i]-ave)*(scores[i]-ave);
                }
                var = varp/n;
                System.out.printf("%f\n",Math.sqrt(var));
            }
        }
    }
}
