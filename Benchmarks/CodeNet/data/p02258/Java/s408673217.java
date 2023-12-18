import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n, maximum = Integer.MIN_VALUE;
        int[] data;
        n = Integer.parseInt(in.readLine());
        data = new int[n];
        for(int i=0; i<n; i++){
          data[i] = Integer.parseInt(in.readLine());
        }
        while(true){
          int x = 0;
          if(x >= n){
            break;
          }
          for(int j=x+1; j<n; j++){
            int temp = data[j] - data[x];
            if(temp > maximum){
              maximum = temp;
            }
          }
          x++;
        }
      System.out.println(maximum);
    }
}