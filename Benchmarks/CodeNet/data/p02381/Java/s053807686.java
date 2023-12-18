import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            int sum1=0;
            int sum2=0;
            if(n==0){
                break;
            }
            int[] scores;
            scores=new int[n];
            for(int i=0;i<scores.length;i++){
                scores[i]=sc.nextInt();
                sum1=sum1+scores[i];
                sum2=sum2+scores[i]*scores[i];
            }
            double ave=0;
            ave=(double)sum1/n;
            double var=0;
            var=(double)sum2/n-ave*ave;
            System.out.println(Math.sqrt(var));
        }
    }
}
