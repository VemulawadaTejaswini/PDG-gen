import java.io.*;
 
class Main {
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double r = Double.parseDouble(br.readLine());
    
    double pi = Math.PI;
    double S = r*r*pi;
    double R = 2*r*pi;
    System.out.printf("%.6f %.6f", S, R);
  }
}