/* ITP1_6_C */
import java.io.*;
import java.util.Arrays;

class Main
{
  static final int BUILDING = 4;
  static final int FLOOR = 3;
  static final int ROOM = 10;

  public static void main(String[] args)
  {
    int[][][] count = new int[BUILDING][FLOOR][ROOM];
    // initialization
    for(int i = 0; i < BUILDING; i++){
      for(int j = 0; j < FLOOR; j++){
          Arrays.fill(count[i][j], 0);
      }
    }

    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();

      int n = Integer.parseInt(br.readLine());

      // process
      for(int i = 0; i < n; i++){
        String[] info = br.readLine().split(" ");
        int building = Integer.parseInt(info[0]) - 1;
        int floor = Integer.parseInt(info[1]) - 1;
        int room = Integer.parseInt(info[2]) - 1;
        int persons = Integer.parseInt(info[3]);

        count[building][floor][room] += persons;
        if(count[building][floor][room] < 0 || count[building][floor][room] > 9)
          return;
      }

      // output
      for(int i = 0; i < 4; i++){
        for(int j = 0; j < 3; j++){
          for(int k = 0; k < 10; k++){
            sb.append(" " + count[i][j][k]);
          }
          sb.append("\n");
        }
        if(i == 3);
        else
          sb.append("####################\n");
      }
      System.out.print(sb);


    }catch(Exception e){
      System.out.println(e);
    }
  }
}