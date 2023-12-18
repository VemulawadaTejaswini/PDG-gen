/* ALDS1_1_D */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int max = 0, min = 0;

      for(int i = 0; i < n; i++){
        int v = Integer.parseInt(br.readLine());
        if(i == 0){
          min = v;
          continue;
        }

        if(max < v - min || i == 1){
          max = v - min;
        }
        if(min > v) min = v;
      }
      System.out.println(max);
    }catch(Exception e){
      System.out.println(e);
    }
  }
}