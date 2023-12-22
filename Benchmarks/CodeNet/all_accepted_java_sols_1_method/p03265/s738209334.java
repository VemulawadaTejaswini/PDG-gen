import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int[] x = new int[2];
    int[] y = new int[2];
    for(int i = 0; i < 2;i++){
      x[i] = scan.nextInt();
      y[i] = scan.nextInt();
    }
    int tx = x[1] - x[0];
    int ty = y[1] - y[0];
    int x3 = x[1] - ty;
    int y3 = y[1] + tx;
    int x4 = x3 - tx;
    int y4 = y3 - ty;
    System.out.println(x3+" "+y3+" "+x4+" "+y4);
  }
}
