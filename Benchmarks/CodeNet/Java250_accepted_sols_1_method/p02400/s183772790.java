import java.io.*;
 
public class Main {
    public static void main(String[] arg)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        double r = Double.parseDouble(str);
 
        double menseki =(double)r * (double)r * 3.141592653589;
        double ensyu =(double)2 * 3.141592653589 * (double)r;

         System.out.printf("%.6f %.6f\n", menseki, ensyu);
    }
}