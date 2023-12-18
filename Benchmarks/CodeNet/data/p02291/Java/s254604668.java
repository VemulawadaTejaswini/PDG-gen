import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double xx = scan.nextDouble();
        double yy = scan.nextDouble();
        int qer = scan.nextInt();
                    
        double xxx = 0;
        double yyy = 0;
        xxx = xx - x;
        yyy = yy - y;
        
        double xp[] = new double[qer];
        double yp[] = new double[qer];
        double ansx[] = new double[qer];
        double ansy[] = new double[qer];
        for(int i = 0; i < qer; i++){
            xp[i] = scan.nextDouble();
            yp[i] = scan.nextDouble();
            double xxxx = x - xp[i];
            double yyyy = y - yp[i];
            ansx[i] = x - xxx * (xxxx * xxx + yyyy * yyy) / (xxx * xxx + yyy * yyy);
            ansy[i] = y - yyy * (xxxx * xxx + yyyy * yyy) / (xxx * xxx + yyy * yyy);
            ansx[i] = 2 * ansx[i] - xp[i];
            ansy[i] = 2 * ansy[i] - yp[i];
            System.out.println(ansx[i] + " " + ansy[i]);
        }

    }

}