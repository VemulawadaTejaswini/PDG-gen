import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    String[] str2 = str1.split(" ");
    int n = Integer.parseInt(str2[0]);

    String str3 = br.readLine();
    String[] str4 = str3.split(" ");

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int total = 0L;

    for (int i = 0; i < n; i++){
      int b = Integer.parseInt(str4[i]);
      if (max < b)
        max = b;
      if (min > b)
        min = b;

      total += b;
    }
    System.out.println(min + " " + max + " " + total);
  }
}