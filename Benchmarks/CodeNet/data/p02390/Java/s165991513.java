import java.io.*;

class Main{
  public static void main(String[] args) {

    InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(sr);
    try{
      String str = br.readLine();
      int a = Integer.parseInt(str);
      int h = a / 3600;
      int m = a % 3600 / 60;
      int s = a % 3600 % 60;

      System.out.println(h+":"+m+":"+s);
    }
    catch(IOException e) {
            e.printStackTrace();
    }
  }
}