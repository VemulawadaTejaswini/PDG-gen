import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int x=sc.nextInt();
        int y=sc.nextInt();
        //int x=3,y=4;
        int h=sc.nextInt();
        int m=sc.nextInt();
        double ans=Math.abs(30*h+m/2.0-6*m);
        if(ans>180)
            ans=360-ans;
        //System.out.println(ans);
        if(ans==180)
            System.out.println(x+y);
        else if(ans==0)
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
