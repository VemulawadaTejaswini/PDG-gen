import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    String[] str2 = str1.split(" ");
    int W = Integer.parseInt(str2[0]);
    int H = Integer.parseInt(str2[1]);
    int x = Integer.parseInt(str2[2]);
    int y = Integer.parseInt(str2[3]);
    int r = Integer.parseInt(str2[4]);

    if ((x - r) >= 0 && (x + r) <= W && (y - r) >= 0 && (y + r) <= H)
      System.out.println("Yes");
    else
      System.out.println("No");
    }
}