import java.io.*;
   
class Main {
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    
    String[] strAry = str.split(" ");
   
    int a = Integer.parseInt(strAry[0]);
    int b = Integer.parseInt(strAry[1]);
    
    int d = a / b;
    int r = a % b;
    String f = String.format("%.5f", 1.0 * a / b);
    System.out.println(d + " " + r + " " + f);
  }
}