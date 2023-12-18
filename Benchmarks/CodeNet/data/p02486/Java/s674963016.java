import java.io.*;
import java.util.*;


public class Main{
  public static void main(String[] args) throws IOException {
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

      for(;;){
        String line = buf.readLine();
        int n = Integer.parseInt(line.split(" ")[0]);
        int x = Integer.parseInt(line.split(" ")[1]);
        if((n==0) && (x==0)){
          break;
        }
        int answer = 0;

        for(int i=1; i<=n; i++) {
          for(int j=1; j<=n; j++) {
            for(int k=1; k<=n; k++) {
              if((i+j+k) == x) {
                answer++;
              }
            }
          }
        }
        System.out.println(answer);
      }
    }
}