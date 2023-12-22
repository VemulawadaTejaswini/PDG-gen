import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      int w = sc.nextInt();
      int[] weight = {1,2,4,8,16,32,64,128,256,512};
      boolean[] useW = new boolean[10];
      for (int i = 9; i >= 0; i--) {
        if (w >= weight[i]) {
          w -= weight[i];
          useW[i] = true;
        }
      }
      String str = "";
      for (int i = 0; i < 10; i++) {
        if (useW[i]) {
          str += weight[i] + " ";
        }
      }
      System.out.println(str.trim());
    }
  }
}