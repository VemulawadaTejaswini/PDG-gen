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

        for(int i=1; i<=n-2; i++) {
          for(int j=i+1; j<=n-1; j++) {
            for(int k=j+1; k<=n; k++) {
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