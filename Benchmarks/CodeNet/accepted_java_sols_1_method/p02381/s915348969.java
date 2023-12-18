import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        double Sqsum = 0.0;
        int s;
        
        int i;
        while(true){
            n = sc.nextInt();
            if(n==0) break;

            for(i=0;i<n;i++){
                s = sc.nextInt();
                sum += s;
                Sqsum += s*s;
            }
            double ave;
            ave = (double)sum/n;
            double x;
            x = (double)Sqsum/n - ave*ave;
            double stdev;
            stdev = Math.sqrt(x);
            System.out.println(stdev);
            sum = 0;
            Sqsum = 0;
        }
        sc.close();
    }
}
