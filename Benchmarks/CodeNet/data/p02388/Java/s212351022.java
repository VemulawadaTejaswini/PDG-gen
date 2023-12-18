import java.io.*;

class Main{
 public static void main(String[] args){
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String line;
  line = br.readLine();
  int num = Integer.parseInt(line);
  int ans = num*3;
  System.out.println(ans);
 }
}