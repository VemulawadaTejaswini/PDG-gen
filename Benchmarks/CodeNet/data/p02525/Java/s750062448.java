import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	int score[],i,n,sum;
        double dev,ave;
        score = new int[1000];
	Scanner sc = new Scanner(System.in);

        for(;;){
            sum = 0;
            dev = 0;
            n = sc.nextInt();
            if(n==0)break;
            for(i=0;i<n;i++){
                score[i] = sc.nextInt();
                sum = sum + score[i];
            }
            ave = (double)sum/n;
            for(i=0;i<n;i++){
                dev = dev + (score[i]*score[i]-ave*ave);
            }
            dev = Math.sqrt(dev/n);
            System.out.printf("%.8f\n",dev);
        }
    }
}