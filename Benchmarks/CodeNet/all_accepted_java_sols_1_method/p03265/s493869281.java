import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] x = new int[4];
    int[] y = new int[4];
    for(int i =0;i<2;i++){
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    int disx = x[1] - x[0];
    int disy = y[1] - y[0];
    x[2] = x[1] - disy;
    y[2] = y[1] + disx;
    x[3] = x[2] - disx;
    y[3] = y[2] - disy;
    for(int i = 2;i<4;i++){
      System.out.println(x[i]);
      System.out.println(y[i]);
    }
  }
}
