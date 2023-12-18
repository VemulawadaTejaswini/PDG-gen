import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
      int count = 0;

      String line_1 = buf.readLine();
      int n = Integer.parseInt(line_1);
      String line_2 = buf.readLine();
      int[] S = new int[n];
      for(int i=0; i<n; i++){
        S[i] = Integer.parseInt(line_2.split(" ")[i]);
      }

      String line_3 = buf.readLine();
      int q = Integer.parseInt(line_3);
      String line_4 = buf.readLine();
      int[] T = new int[q];
      for(int j=0; j<q; j++){
        T[j] = Integer.parseInt(line_4.split(" ")[j]);
      }

      for(int k:T){
        for(int l:S){
          if(k==l){
            count++;
            break;
          }
        }
      }
      System.out.println(count);
    }
  }