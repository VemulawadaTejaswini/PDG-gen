import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int countSharp = 0;
    int count90 = 0;
    int countDon = 0;
    while(true) {
      int[] c = new int[3];
      for(int i = 0; i < 3; i++) {
        c[i] = scan.nextInt();
      }
      int maxInt = 0;
      Arrays.sort(c);
      // maxInt = Math.max(c[0], c[1]);
      // maxInt = Math.max(maxInt, c[2]);
      if (c[0] + c[1] <= c[2]) {
        break;
      }
      if(c[0] * c[0] + c[1] * c[1] < c[2] * c[2]) {
        countDon++;
      } else if (c[0] * c[0] + c[1] * c[1] > c[2] * c[2]) {
        countSharp++;
      } else{
        count90++;
      }
    }
    System.out.println(countSharp + count90 + countDon + " " + count90 + " " + countSharp + " " + countDon);
  }
}
