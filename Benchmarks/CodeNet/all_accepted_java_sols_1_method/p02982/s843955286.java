import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int d = Integer.parseInt(str[1]);
    int[][] x = new int[n][d];
    int count = 0;
    for(int i = 0; i < n; i++) {
        str = in.readLine().split(" ");
      for(int j = 0; j < d ; j++) {
        x[i][j] = Integer.parseInt(str[j]);
      }
    }
    for(int i = 1; i < n; i++) {
      for(int j = 0; j < i; j++) {
        long c=0;
        for(int k = 0; k < d; k++) {
          c += Math.abs(x[i][k]-x[j][k]) * Math.abs(x[i][k]-x[j][k]);
        }
        if(Math.sqrt(c) % 1==0){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}