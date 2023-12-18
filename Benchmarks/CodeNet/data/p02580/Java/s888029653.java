import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] head = br.readLine().split(" ");
    int h = Integer.parseInt(head[0]);
    int w = Integer.parseInt(head[1]);
    int m = Integer.parseInt(head[2]);

    int[] sum_h = new int[h];
    int[] sum_w = new int[w];
    int[][] bombs = new int[m][2];
    for(int i = 0; i < m; i++){
      String[] line = br.readLine().split(" ");
      bombs[i][0] = Integer.parseInt(line[0]) - 1;
      bombs[i][1] = Integer.parseInt(line[1]) - 1;
      sum_h[bombs[i][0]]++;
      sum_w[bombs[i][1]]++;
    }
    br.close();

    int max_sum_h = 0;
    int max_cnt_h = 0;
    for(int i = 0; i < h; i++){
      if(max_sum_h < sum_h[i]){
        max_sum_h = sum_h[i];
        max_cnt_h = 1;
      } else if(max_sum_h == sum_h[i]){
        max_cnt_h++;
      }
    }
    int max_sum_w = 0;
    int max_cnt_w = 0;
    for(int i = 0; i < w; i++){
      if(max_sum_w < sum_w[i]){
        max_sum_w = sum_w[i];
        max_cnt_w = 1;
      } else if(max_sum_w == sum_w[i]){
        max_cnt_w++;
      }
    }
    long max_bombs_pos_nominee = (long) max_cnt_h * max_cnt_w;
    for(int i = 0; i < m; i++){
      if(sum_h[bombs[i][0]] == max_sum_h && sum_w[bombs[i][1]] == max_sum_w){
        max_bombs_pos_nominee--;
      }
    }
    if(max_bombs_pos_nominee == 0){
      System.out.println(max_sum_h + max_sum_w - 1);
    } else {
      System.out.println(max_sum_h + max_sum_w);
    }
  }
}