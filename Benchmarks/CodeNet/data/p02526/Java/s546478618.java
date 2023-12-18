import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
      boolean[] a = new boolean[1000001];
      int count = 0;

      String line_1 = buf.readLine();
      int n = Integer.parseInt(line_1);
      String line_2 = buf.readLine();
      String[] S = line_2.split(" ");
      for(int i=0; i<n; i++){
        a[Integer.parseInt(S[i])] = true;
      }

      String line_3 = buf.readLine();
      int q = Integer.parseInt(line_3);
      String line_4 = buf.readLine();
      String[] T = line_4.split(" ");

      for(int j=0; j<q; j++){
        if(a[Integer.parseInt(T[j])]){
          count++;
        }
      }

      System.out.println(count);
    }
  }