import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    int[] a = new int[6];
    double[] b = new double[6];
    Scanner s = new Scanner(System.in);
    double x, y;
    double temp;

    while(true){
      for(int i = 0;i < 6;i++){
        a[i] = s.nextInt();
        b[i] = (double)a[i];
      }

      if(b[0] == 0.0f){
        y = b[2]/b[1];
        x = (b[5] - y * b[4])/b[3];
      }else if(b[1] == 0.0f){
        x = b[2]/b[0];
        y = (b[5] - x * b[3])/b[4];
      }else if(b[3] == 0.0f){
        y = b[5]/b[4];
        x = (b[2] - y * b[1])/b[0];
      }else if(b[4] == 0.0f){
        x = b[5]/b[3];
        y = (b[2] - x * b[0])/b[1];
      }else{
        temp = b[0]/b[3];

        b[3] = b[3] * temp;
        b[4] = b[4] * temp;
        b[5] = b[5] * temp;

        y = (b[2] - b[5])/(b[1] - b[4]);
        x = (b[5] - y * b[4])/b[3];
      }

      System.out.printf("%.3f %.3f",x ,y);
    }
  }
}