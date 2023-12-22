import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");
    int a = Integer.parseInt(in[0]);
    int b = Integer.parseInt(in[1]);
    int k = Integer.parseInt(in[2]);

    br.close();

    for(int i = 0; i < k; i++){
      a /= 2;
      b += a;
      i++;
      if(i >= k) break;
      b /= 2;
      a += b;
    }
    System.out.println(a + " " + b);
  }
}