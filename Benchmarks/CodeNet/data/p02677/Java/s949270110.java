import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Varun
 */
public class div168 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        double th =(double)(h*60+m)/720 *2*Math.PI;
        double tm =(double)(m/60)*2*Math.PI;
        double xh = a*Math.cos(th);
        double yh = a*Math.sin(th);
        double xm = b*Math.cos(tm);
        double ym = b*Math.sin(tm);
        double dx = xh-xm;
        double dy = yh-ym;
        double ans = ((dx*dx)+(dy*dy));
        double ans1 = Math.sqrt(ans);
        System.out.printf("%.10f\n",ans1);
        
        
    }
    
}
