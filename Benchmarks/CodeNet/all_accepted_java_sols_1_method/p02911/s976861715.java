import java.io.*;

public class Main {
  public static void main(String... args) {
    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));

    try {
      String[] line = br.readLine().split(" ");
      int n = Integer.parseInt(line[0]);
      int k = Integer.parseInt(line[1]);
      int q = Integer.parseInt(line[2]);
      int[] point = new int[n];

      for(int i = 0; i < q; i++) {
          point[Integer.parseInt(br.readLine()) - 1] += 1; 
      }

      for(int i =0; i < n; i++){
        point[i] += k - q;
      }

      for(int i = 0; i < point.length; i++) {
        if(point[i] <= 0) {
          System.out.println("No");
        } else {
          System.out.println("Yes");
        }
      }
      br.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}