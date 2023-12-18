/* ITP1_10_D */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());

      String[] x_st = br.readLine().split(" ");
      String[] y_st = br.readLine().split(" ");
      double[] x = new double[n];
      double[] y = new double[n];
      double[] distance = new double[n];
      double d1 = 0, d2 = 0, d3 = 0, d_infinite = 0;

      for(int i = 0; i < n; i++){
        x[i] = Double.parseDouble(x_st[i]);
        y[i] = Double.parseDouble(y_st[i]);
      }
      // p = 1
      for(int i = 0; i < n; i++){
        distance[i] = Math.abs(x[i] - y[i]);
        d1 += distance[i];
        d2 += Math.pow(distance[i], 2);
        d3 += Math.pow(distance[i], 3);
        if(d_infinite < distance[i]) d_infinite = distance[i];
      }
      d2 = Math.pow(d2, 1./2);
      d3 = Math.pow(d3, 1./3);//.??????????????¨??§double???

      System.out.println(d1 + "\n" + d2 + "\n" + d3 + "\n" + d_infinite);

    }catch(Exception e){
      System.out.println(e);
    }
  }
}