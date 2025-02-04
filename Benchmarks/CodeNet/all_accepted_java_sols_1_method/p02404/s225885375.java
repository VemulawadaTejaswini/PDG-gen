/* ITP1_5_B */
import java.io.*;

class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while(true){
      //input
      String str[] = br.readLine().split(" ");
      int height = Integer.parseInt(str[0]);
      int width = Integer.parseInt(str[1]);
      //finish
      if(height == 0 && width == 0) break;
      if(height < 3 && width > 100) break;
      //draw
      for(int i = 0; i < height; i++){ //height

        for(int j = 0; j < width; j++){ //width

          if(i == 0 || i == height-1){
            sb.append("#");

          }else {
            if(j == 0 || j== width-1)
              sb.append("#");
            else
              sb.append(".");
          }
        }
        sb.append("\n");
      }
      sb.append("\n");
    }
    System.out.print(sb);
  }
}