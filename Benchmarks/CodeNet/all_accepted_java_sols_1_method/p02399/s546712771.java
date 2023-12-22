import java.io.*;
 
class Main {
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String[] strAry = str.split(" ");
     
    int x = Integer.parseInt(strAry[0]);
    int y = Integer.parseInt(strAry[1]);

    int d = x/y;
    int r = x % y;
    String f = String.format("%.5f", ((double)x/(double)y));
    System.out.println(d +" "+ r +" "+ f);
  }
}