import java.io.*;

class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str[] = br.readLine().split(" ",0);
    int n[] = new int[str.length];
    int count = 0;

    for(int i = 0; i < str.length; i++) n[i] = Integer.parseInt(str[i]);

    for(int x = n[0]; x <= n[1]; x++){
      if(n[2] % x == 0) count++;
    }
    System.out.println(count);
  }
}