

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
         
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int i=0;
            while ((line = br.readLine()) != null) {
                double r=Double.parseDouble(line);
                System.out.println(String.format("%.6f",r*r*Math.PI)+" "+String.format("%.6f",2*r*Math.PI));
                 
                break;
            }
        }
    }
}



 