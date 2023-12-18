/* ITP1_7_A */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();

      while(true){
        // input
        String[] score = br.readLine().split(" ");
        int mid_exam = Integer.parseInt(score[0]);
        int fin_exam = Integer.parseInt(score[1]);
        int retest = Integer.parseInt(score[2]);
        // errorcheck
        if(mid_exam < -1 || mid_exam > 50) return;
        if(fin_exam < -1 || fin_exam > 50) return;
        if(retest < -1 || retest > 100) return;
        // finish
        if(mid_exam == -1 && fin_exam == -1 && retest == -1) break;

        int mid_fin = mid_exam + fin_exam;
        // grading
        if(mid_exam == -1 || fin_exam == -1){
          sb.append("F\n");
          continue;
        }
        if(mid_fin >= 80){
          sb.append("A\n");

        }else if(mid_fin >= 65){
          sb.append("B\n");

        }else if(mid_fin >= 50){
          sb.append("C\n");

        }else if(mid_fin >= 30){
          if(retest >= 50){
            sb.append("C\n");
          }else{
            sb.append("D\n");
          }

        }else{
          sb.append("F\n");
        }
      }
      // output
      System.out.print(sb);
    }catch(Exception e){
      System.out.println(e);
    }
  }
}