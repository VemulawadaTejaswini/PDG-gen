import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] line1 = br.readLine().split(" ");
    int n = Integer.parseInt(line1[0]);
    long k = Long.parseLong(line1[1]);
    
    
    long[] array = new long[100000];
    String[] data;
    int a;
    long b;
    for (int i=0; i<n; i++){
      data = br.readLine().split(" ");
      a = Integer.parseInt(data[0]);
      b = Integer.parseInt(data[1]);
      array[a-1] += b;
    }
    long temp = 0;
    for (int i=0; i<100000; i++){
      temp += array[i];
      if (temp>=k) {
        System.out.println(i+1);
        return;
      }
    }
  }
}
