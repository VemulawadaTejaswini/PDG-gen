import java.io.*;
class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(br.readLine().trim());
    if(x >= 30)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}