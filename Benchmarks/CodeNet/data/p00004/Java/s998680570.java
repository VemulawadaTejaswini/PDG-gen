import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String st = br.readLine();
            while(st!=null){
            String[] s = st.split(" ",0);
            double a = Double.parseDouble(s[0]);
            double b = Double.parseDouble(s[1]);
            double c = Double.parseDouble(s[2]);
            double d = Double.parseDouble(s[3]);
            double e = Double.parseDouble(s[4]);
            double f = Double.parseDouble(s[5]);
            double x = (c*e-b*f)/(a*e-b*d);
            double y = (c*d-a*f)/(b*d-a*e);
            System.out.printf("%.3f %.3f\n",x,y);
            st = br.readLine();
            }
        }catch (Exception ex){
            System.exit(0);
        }
    }
}