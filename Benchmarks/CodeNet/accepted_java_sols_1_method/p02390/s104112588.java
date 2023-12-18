import java.io.*;

class Main{
 public static void main(String[] arg) throws IOException{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String str = br.readLine();

  int x = Integer.parseInt(str), h=x/3600, m, s;
  x %= 3600;
  m = x/60;
  x %= 60;
  s = x;

  System.out.println(h + ":" + m + ":" + s);
 }
}