/* ITP1_7_B */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      String str = "";

      while((str = br.readLine()).equals("0 0") == false){
        // input
        String[] input = str.split(" ");
        int n = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);
        if(n < 3 || n > 100) return;

        int count = 0;
        // finish
        if(n == 0 && x == 0) break;
        // check
        for(int i = 1; i <= n; i++){
          for(int j = (i + 1); (i + j) < x; j++){
            int k = x - i - j;
            if(k > j && k <= n) count++;
          }
        }
        sb.append(count + "\n");
      }
      // output
      System.out.print(sb);
    }catch(Exception e){
      System.out.println(e);
    }
  }
}