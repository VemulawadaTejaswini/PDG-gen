import java.io.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    String[] str2 = str1.split(" ");
    int r = Integer.parseInt(str2[0]);


    double S = Math.PI * r * r;
    double l = 2 * Math.PI * r;

    System.out.println(String.format("%.6f", S) + " " + String.format("%.6f", l));
    }
}