
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int d=in.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            int y=in.nextInt();
            double dist=Math.sqrt((double)x*x + (double)y*y);
           // System.out.println(dist);
            if(dist<=(double)d)
                count++;
        }
        System.out.println(count);

    }
}
