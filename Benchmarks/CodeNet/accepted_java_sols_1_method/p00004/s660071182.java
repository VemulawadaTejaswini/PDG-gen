import java.io.*;

public class Main {
	 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        String s;
        while ((s = br.readLine()) != null) {
            String[] lc = s.split(" ");
            double a = Double.parseDouble(lc[0]);
            double b = Double.parseDouble(lc[1]);
            double c = Double.parseDouble(lc[2]);
            double d = Double.parseDouble(lc[3]);
            double e = Double.parseDouble(lc[4]);
            double f = Double.parseDouble(lc[5]);
            
            double z = a*e - b*d;
            
            double x = (e*c-b*f)/z;
            double y = (-d*c + a*f)/z;
             
            System.out.println(String.format("%.3f %.3f", Math.round(x*1000)/1000.0 , Math.round(y*1000)/1000.0));
        }
 
    }
}