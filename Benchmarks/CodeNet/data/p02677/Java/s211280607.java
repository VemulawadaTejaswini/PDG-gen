import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int x=sc.nextInt();
        int y=sc.nextInt();
        int h=sc.nextInt();
        int m=sc.nextInt();
        double ans=30*h+m/2-6*m;
        if(ans>180)
            ans-=180;
        //System.out.println(ans);
        if(ans==0)
            System.out.println(x+y);
        else if(ans==180)
            System.out.println(Math.abs(x-y));
        else{
            double a = Math.toRadians(ans);
            //System.out.println(Math.cos(a));
            double p=x*x+y*y-2*x*y*Math.cos(a);
            //System.out.println(p);
            p=Math.sqrt(p);
            System.out.println(p);
        }




    }
}
