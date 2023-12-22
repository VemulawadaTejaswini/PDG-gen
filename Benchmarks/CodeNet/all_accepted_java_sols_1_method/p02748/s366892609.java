import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] line1 = br.readLine().split(" ");
    int a = Integer.parseInt(line1[0]);
    int b = Integer.parseInt(line1[1]);
    int m = Integer.parseInt(line1[2]);
    
    int mina = Integer.MAX_VALUE;
    int minb = Integer.MAX_VALUE;
    
    String[] as = br.readLine().split(" ");
    int[] asint = new int[a];
    for (int i=0; i<a; i++){
      asint[i] = Integer.parseInt(as[i]);
      if(mina>asint[i]){
        mina = asint[i];
      }
    }
    String[] bs = br.readLine().split(" ");
    int[] bsint = new int[b];
    for (int i=0; i<b; i++){
      bsint[i] = Integer.parseInt(bs[i]);
      if (minb>bsint[i]){
        minb = bsint[i];
      }
    }
    int minsum = mina + minb;
    String[] data;
    int x;
    int y;
    int c;
    int temp;
    
    for (int i=0; i<m; i++){
      data = br.readLine().split(" ");
      x = Integer.parseInt(data[0]);
      y = Integer.parseInt(data[1]);
      c = Integer.parseInt(data[2]);
      temp = asint[x-1] + bsint[y-1] - c;
      if (temp < minsum){
        minsum = temp;
      }
    }
    System.out.println(minsum);
  }
}