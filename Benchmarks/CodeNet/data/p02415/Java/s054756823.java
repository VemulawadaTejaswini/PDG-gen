import java.io.*;
import java.lang.StringBuilder;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    char[] ch = br.readLine().toCharArray();
    for(char c : ch){
      String s = String.valueOf(c);
      if (c < 'a')
      sb.append(s.toLowerCase());
      else if(c >= 'a')
      sb.append(s.toUpperCase());
    }
    System.out.println(sb);
  }
}