/* ITP1_10_A */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String[] str = br.readLine().split(" ");
      double[] p1 = {Double.parseDouble(str[0]), Double.parseDouble(str[1])};
      double[] p2 = {Double.parseDouble(str[2]), Double.parseDouble(str[3])};

      double ans = Math.sqrt(Math.pow((p1[0] - p2[0]), 2) + Math.pow((p1[1] - p2[1]), 2));//?????¢????¨?????????????
      System.out.printf("%.4f\n",ans);
    }catch(Exception e){
      System.out.println(e);
    }
  }
}