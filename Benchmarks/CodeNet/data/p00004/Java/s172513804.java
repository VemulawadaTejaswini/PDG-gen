
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wijebandara
 */
public class Main {
    public static void main(String[] args) {
        try {
            java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
            
            String s =in.readLine();
            StringTokenizer st;
            while (s!=null) {
                st =new StringTokenizer(s);
                double a = Integer.parseInt(st.nextToken());
                double b = Integer.parseInt(st.nextToken());
                double c = Integer.parseInt(st.nextToken());
                double d = Integer.parseInt(st.nextToken());
                double e = Integer.parseInt(st.nextToken());
                double f = Integer.parseInt(st.nextToken());
                
                double y = (c*d-a*f)/(b*d-e*a);
                double x = (c*e-b*f)/(e*a-b*d);
                if(x==0.0)
                {
                    x=0.0;
                }
                if(y==0.0)
                {
                    y=0.0;
                }
                System.out.printf("%.3f %.3f\n",x,y);
                s =in.readLine();
            }
        } catch (Exception ex) {
            System.exit(0);
        }
        
    }
}