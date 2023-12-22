import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int skill = scan.nextInt();
    long count = 0;
    int[] mon = new int[num];

    for(int i = 0; i < num; i++){
      mon[i] = scan.nextInt();
    }

    Arrays.sort(mon);
    for(int i = num - 1; i >= 0; i--){
      if (skill == 0){
        break;
      }
      mon[i] = 0;
      skill--;
    }

    for(int i = 0; i < num; i++){
      count += mon[i];
    }
    //for(int i = 0; i < num; i++){
      //System.out.println(mon[i]);
    //}

    System.out.println(count);
  }
}
