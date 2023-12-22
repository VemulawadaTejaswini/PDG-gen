import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        double m;
        double v;
        while(true){
            int n=sc.nextInt();
            if(n==0) break;
            m=0;
            double s[];
            s=new double[n];
            for(int i=0;i<n;i++){
                s[i]=sc.nextDouble();
                m+=s[i];
            }
            m/=n;
            v=0;
            for(int i=0;i<n;i++){
                v+=(s[i]-m)*(s[i]-m);
            }
            v/=n;
            System.out.println(Math.sqrt(v));
        }
    }
}
