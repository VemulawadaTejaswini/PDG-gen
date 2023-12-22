/* Volume1 */
import java.io.*;

class Main
{
  public static final int NUMBER = 10;

  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int[] array = new int[NUMBER];
      int[] height = new int[3];

      for(int i = 0; i < NUMBER; i++){
        array[i] = Integer.parseInt(br.readLine());
      }
      for(int i = 0; i < 3 ; i++){
        height[i] = array[i];
        int index = i;
        for(int j = i+1; j < NUMBER; j++){
          if(array[index] < array[j]) index = j;
        }
        int tmp = height[i];
        height[i] = array[index];
        array[index] = tmp;
        sb.append(height[i]).append("\n");
      }

      System.out.print(sb);
    }catch(Exception e){
      System.out.println(e);
    }
  }
}