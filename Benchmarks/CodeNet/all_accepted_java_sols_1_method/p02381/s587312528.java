/* ITP1_10_C */
import java.io.*;

class Main
{
  public static int student;
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      while((student = Integer.parseInt(br.readLine())) != 0){
        String[] str = br.readLine().split(" ");
        double[] score = new double[student];
        double mean = 0;
        double variance = 0;

        for(int i = 0; i < student; i++){
          score[i] = Integer.parseInt(str[i]);
          mean += score[i];
        }
        mean /= student;

        for(int i = 0; i < student; i++){
          variance += Math.pow((score[i] - mean), 2);
        }
        variance = variance / student;
        
        System.out.println(Math.sqrt(variance));
      }
    }catch(Exception e){
      System.out.println(e);
    }
  }
}