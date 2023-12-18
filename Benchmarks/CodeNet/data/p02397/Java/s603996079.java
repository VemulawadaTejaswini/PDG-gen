import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner;
    while(true){
      String str = sc.nextLine();
      int[] x = Integer.parseInt(str.split(" "));
      if(x[0] == 0 && x[1] == 0){
        break;
      }
      Arrays.sort(x);
      System.out.println(x[0] + " " + x[1]);
    }
  }
}
