import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      String str = sc.nextLine();
      String[] str2 = str.split(" ");
      int[] x = new int[str2.length()];
      for (int i = 0; i < str2.length(); i++){
        x[i] = Integer.parseInt(str2[i]);
      }
      if(x[0] == 0 && x[1] == 0){
        break;
      }
      Arrays.sort(x);
      System.out.println(x[0] + " " + x[1]);
    }
  }
}
