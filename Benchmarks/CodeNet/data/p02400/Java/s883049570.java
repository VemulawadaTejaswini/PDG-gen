import java.io.*;
 
class Main {
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    double r = Integer.parseInt(str);
    double pi = Math.PI;
    String V = String.format("%.6f", ((double)r*(double)r*pi));
    String S = String.format("%.6f", ((double)r*2.0*pi));
    System.out.println(V +" "+ S);
  }
}