import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        while(true){
            n = sc.nextInt();
            if(n == 0){
                break;
            }

            int[] score = new int[n];
            int sum_1=0;
            for(int i=0;i<n;i++){
                score[i] = sc.nextInt();
                sum_1 += score[i];
            }

            
            double ave,sum_2=0,sd;
            ave = (double)sum_1/n;
            for(int i=0;i<n;i++){
                sum_2 += Math.pow((score[i]-ave),2);
            }
            sd = Math.sqrt((double)sum_2/n);
            System.out.printf("%.5f\n",sd);
        }
    }
}

