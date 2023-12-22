import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int i;
        double dis,sta;
        Scanner sc=new Scanner(System.in);

        while(true){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            int sum=0,sqsum=0;
            for(i=0;i<n;i++){
                int score=sc.nextInt();
                sum+=score;
                sqsum+=score*score;
            }
            dis=(double)sqsum/n-(double)sum/n*(double)sum/n;
            sta=Math.sqrt(dis);
            System.out.printf("%.8f\n",sta);
        }
        sc.close();
    }
}
