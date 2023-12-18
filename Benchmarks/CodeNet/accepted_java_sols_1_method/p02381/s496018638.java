import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n,i,sum1=0;
        int[] score;
        double ave,div,sum2=0;

        score = new int[1000];

        while(true){
            n=scan.nextInt();
            if(n==0){
                break;
            }

            for(i=0;i<n;i++){
                score[i]=scan.nextInt();
                sum1+=score[i];
            }

            ave=(double)sum1/n;
            
            for(i=0;i<n;i++){
                sum2+=((score[i]-ave)*(score[i]-ave));
            }
            div=(double)sum2/n;

            System.out.println(Math.sqrt(div));

            sum1=0;
            sum2=0;
        }

    }
}
