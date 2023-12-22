
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            int[] x = new int[n];
            int sum=0;
            double bun=0.0;
            if(n==0){
                break;
            }else{
                for(int i=0 ; i<n ; i++){
                    x[i] = sc.nextInt();
                    sum += x[i];
                }
                double ave = sum/(double)n;
                for(int i=0 ; i<n ; i++){
                    bun += (x[i]-ave)*(x[i]-ave);
                }
                System.out.println(Math.sqrt(bun/(double)n));
            }
        }
    }
}

