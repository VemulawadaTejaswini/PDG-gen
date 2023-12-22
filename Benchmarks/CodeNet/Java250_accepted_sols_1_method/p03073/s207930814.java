import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    String[] sList = s.split("");

    int[] intList = new int[s.length()];
    for(int i = 0;i < s.length(); i++){
      intList[i] = Integer.parseInt(sList[i]);
    }

    int startBlack = 0;
    int startWhite = 0;

    if(intList[0] == 0) {
      int next = 0;
      for (int i = 0; i < s.length(); i++) {
        if(intList[i] == next) {
          if(next == 0) {
            next = 1;
          } else if (next == 1) {
            next = 0;
          }
        } else {

          startBlack++;

          if(next == 0) {
            next = 1;
          } else if (next == 1) {
            next = 0;
          }
        }
      }
    } else if (intList[0] == 1) {
      int next = 1;
      for (int i = 0; i < s.length(); i++) {
        if(intList[i] == next) {
          if(next == 0) {
            next = 1;
          } else if (next == 1) {
            next = 0;
          }
        } else {

          startBlack++;
          if(next == 0) {
            next = 1;
          } else if (next == 1) {
            next = 0;
          }
        }
      }
    }

    if(startBlack > startWhite) {
      System.out.println(startBlack);
    } else if (startWhite > startBlack) {
      System.out.println(startWhite);
    } else {
      System.out.println(startBlack);
    }

  }
}
