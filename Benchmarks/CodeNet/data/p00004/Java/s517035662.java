import java.io.BufferedReader;
import java.io.InputStreamReader;
  
public class Main {
  
    public static void main(String[] args) throws Exception {
        BufferedReader br = 
                new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        while(str != null){
            String lns[] = str.split(" ");
            double a = Double.parseDouble(lns[0]);
            double b = Double.parseDouble(lns[1]);
            double c = Double.parseDouble(lns[2]);
            double d = Double.parseDouble(lns[3]);
            double e = Double.parseDouble(lns[4]);
            double f = Double.parseDouble(lns[5]);

            for(int y = -1000 ; y < 1000; y++){
                double x = c + f / (b * y + e * y) / ( a + d);
                if(x>-1000 && x<1000){
                    System.out.prdoubleln(x + "," + y);           
                    break;     
                }
            }

            // System.out.prdoubleln(a + " " + b + " " + c +  " " + d +  " " + e + " " + f );
            str = br.readLine();
        }
        // System.out.prdoubleln(String.format("%d:%d:%d", hour, min, sec));
    }
}