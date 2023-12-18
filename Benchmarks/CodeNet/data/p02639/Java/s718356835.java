import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<String>();
      int x_1,x_2,x_3,x_4,x_5;
      int i = 0;
      String an = scan.nextLine();
      String atai[] = an.split(" ",0);
      int num[] = new int[5];
      while(i < 5){
        num[i] = Integer.parseInt(atai[i]);
        i++;
      }
      x_1 = num[0];
      x_2 = num[1];
      x_3 = num[2];
      x_4 = num[3];
      x_5 = num[4];
//      System.out.println(A+","+B+","+H+","+M);
      check(num);
        scan.close();
    }
  
  public static void check(int[] num){
   //System.out.println(num[0]);
    int i = 0;
    while(i<5){
      if(num[i] == 0){
        System.out.println(i+1);
        break;
      }
      i++;
    }
    return;
  }
}