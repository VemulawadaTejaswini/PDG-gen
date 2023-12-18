import java.io.*;

public class Main {
    public static void GetCubed(int num){
      int n = (int)Math.pow(num, 3);
      System.out.println(n);
    }

    public static void main(String[] args) throws IOException{
      BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
      String s = r.readLine();
      int num = Integer.parseInt(s);
      GetCubed(num);
    }
}