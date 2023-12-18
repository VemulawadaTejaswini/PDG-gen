import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      StringBuilder buf = new StringBuilder();

      while(true) {
        int n = Integer.parseInt(in.readLine());

        if(n == 0) break;

        int maxX = 0, minX = 0;
        int maxY = 0, minY = 0;

        int[][] boxes = new int[n][2];
        boxes[0][0] = 0;
        boxes[0][0] = 0;
        int x=0, y=0;
        int ni,di;
        String[] lines;

        for(int i=1; i<n; i++) {
          lines = in.readLine().split(" ");
          ni = Integer.parseInt(lines[0]);
          di = Integer.parseInt(lines[1]);
          x = boxes[ni][0];
          y = boxes[ni][1];

          switch(di) {
            case 0:
              boxes[i][0] = --x;
              boxes[i][1] = y;
              minX = Math.min(minX,x);
              break;
            case 1:
              boxes[i][0] = x;
              boxes[i][1] = --y;
              minY = Math.min(minY,y);
              break;
            case 2:
              boxes[i][0] = ++x;
              boxes[i][1] = y;
              maxX = Math.max(maxX,x);
              break;
            case 3:
              boxes[i][0] = x;
              boxes[i][1] = ++y;
              maxY = Math.max(maxY,y);
              break;
            default:
          }
        }

        buf.append(maxX - minX + 1)
           .append(" ")
           .append(maxY - minY + 1)
           .append("\n");
      }

      System.out.print(buf);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}
