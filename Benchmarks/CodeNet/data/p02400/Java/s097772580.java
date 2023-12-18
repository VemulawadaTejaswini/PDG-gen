import java.io.*;
  
public class Main {
  
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
        
        double r = Double.parseDouble(br.readLine());
  
        double pi = Math.PI;
        double x = r * r * pi;
        double y = 2 * r * pi;
        System.out.printf("%.6f %.6f", x, y);
                
    }catch(IOException e){}
    }
}