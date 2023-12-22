import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    String[] str2 = str1.split(" ");
    int a = Integer.parseInt(str2[0]);
    int b = Integer.parseInt(str2[1]);
    int c = Integer.parseInt(str2[2]);

    if (a < b && b < c)
      System.out.println("Yes");
    else
      System.out.println("No");
    }
}