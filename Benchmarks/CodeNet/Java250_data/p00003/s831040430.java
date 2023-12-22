/* Volume0_3 */
import java.io.*;
import java.util.Arrays;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int N = Integer.parseInt(br.readLine());
      int[] edges = new int[3];

      for(int i = 0; i < N; i++){
        String[] str = br.readLine().split(" ");
        for(int j = 0; j < 3; j++){
          edges[j] = Integer.parseInt(str[j]);
        }
        Arrays.sort(edges);

        if(Math.pow(edges[2], 2) == Math.pow(edges[0], 2) + Math.pow(edges[1], 2)){
          sb.append("YES").append("\n");
        }else {
          sb.append("NO").append("\n");
        }
      }
      System.out.print(sb);

    }catch(Exception e){
      System.out.println(e);
    }
  }
}