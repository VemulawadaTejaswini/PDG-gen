import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n;

        while(true){
            n=scan.nextInt();
            if(n==0) break;
            int[] score=new int[n];
            double ave=0;
            for(int i=0;i<n;i++){
                score[i]=scan.nextInt();
                ave+=score[i];
            }
            ave/=(double)n;
            double dis=0;
            for(int i=0;i<n;i++) dis+=(score[i]-ave)*(score[i]-ave);
            dis/=(double)n;
            System.out.println(Math.sqrt(dis));
        }
    }
}
