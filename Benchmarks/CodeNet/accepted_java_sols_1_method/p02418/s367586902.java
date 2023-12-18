import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    String p = br.readLine();
    s += s;
    if (s.contains(p)){
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
}