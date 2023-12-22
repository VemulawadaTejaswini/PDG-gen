import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[][][] room = new int[4][3][10];
    int n = Integer.parseInt(br.readLine());
    for(int b=0;b<4;b++) {
      for(int f=0;f<3;f++) {
        for(int r=0;r<10;r++) {
          room[b][f][r] = 0;
        }
      }
    }
    for(int i=0;i<n;i++) {
      String[] input = br.readLine().split(" ");
      int b = Integer.parseInt(input[0]);
      int f = Integer.parseInt(input[1]);
      int r = Integer.parseInt(input[2]);
      int v = Integer.parseInt(input[3]);
      room[b-1][f-1][r-1] += v;
    }
    for(int b=0;b<4;b++) {
      for(int f=0;f<3;f++) {
        for(int r=0;r<10;r++) {
          System.out.print(" " + room[b][f][r]);
        }
        System.out.println();
      }
      if(b!=3) {
        System.out.println("####################");
      }
    }
  }
}