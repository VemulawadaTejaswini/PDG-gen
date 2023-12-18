/* Volume0_3 */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int N = Integer.parseInt(br.readLine());

      for(int i = 0; i < N; i++){
        String[] edges = br.readLine().split(" ");
        int edge_1st = Integer.parseInt(edges[0]);
        int edge_2nd = Integer.parseInt(edges[1]);
        int edge_3rd = Integer.parseInt(edges[2]);
        int tmp;

        if(edge_1st < edge_2nd){
          tmp = edge_1st;
          edge_1st = edge_2nd;
          edge_2nd = tmp;
        }
        if(edge_1st < edge_3rd){
          tmp = edge_1st;
          edge_1st = edge_3rd;
          edge_3rd = tmp;
        }
        if(edge_2nd < edge_3rd){
          tmp = edge_2nd;
          edge_2nd = edge_3rd;
          edge_3rd = tmp;
        }

        if(Math.pow(edge_1st, 2) == Math.pow(edge_2nd, 2) + Math.pow(edge_3rd, 2)){
          sb.append("Yes").append("\n");
        }else {
          sb.append("No").append("\n");
        }
      }
      System.out.print(sb);

    }catch(Exception e){
      System.out.println(e);
    }
  }
}