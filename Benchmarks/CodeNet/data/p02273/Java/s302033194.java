import static java.lang.Math.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        double[] p1 = {0, 0};
        double[] p2 = {100, 0};
        
        System.out.println(p1[0] + " " + p1[1]);
        kock(n, p1, p2);
        System.out.println(p2[0] + " " + p2[1]);
    }
    
    static void kock(int n, double[] p1, double[] p2){
        
        if(n == 0) return;
        
        double[] s = new double[2];
        s[0] = (2*p1[0] + p2[0])/3;
        s[1] = (2*p1[1] + p2[1])/3;
        
        double[] t = new double[2];
        t[0] = (p1[0] + 2*p2[0])/3;
        t[1] = (p1[1] + 2*p2[1])/3;
        
        double[] u = new double[2];
        u[0] = (t[0]-s[0]) * cos(toRadians(60)) - (t[1]-s[1]) * sin(toRadians(60)) + s[0];
        u[1] = (t[0]-s[0]) * sin(toRadians(60)) + (t[1]-s[1]) * cos(toRadians(60)) + s[1];
        
        kock(n-1, p1, s);
        System.out.println(s[0] + " " + s[1]);
        kock(n-1, s, u);
        System.out.println(u[0] + " " + u[1]);
        kock(n-1, u, t);
        System.out.println(t[0] + " " + t[1]);
        kock(n-1, t, p2);
    }
}
