/* ITP1_5_C */
import java.io.*;

class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while(true){
      // input
      String str[] = br.readLine().split(" ");
      int height = Integer.parseInt(str[0]);
      int width = Integer.parseInt(str[1]);
      //finish
      if(height == 0 && width == 0) break;
      if(height > 300 || width > 300) break;
      // drow
      for(int i = 0; i < height; i++){
        for(int j = 0; j < width; j++){
          if((i + j) % 2 == 0)
            sb.append("#");
          else
            sb.append(".");
        }
        sb.append("\n");
      }
      sb.append("\n");
    }
    // output
    System.out.print(sb);
  }
}