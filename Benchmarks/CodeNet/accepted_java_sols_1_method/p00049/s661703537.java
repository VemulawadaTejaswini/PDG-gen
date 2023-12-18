import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] counter = {0,0,0,0};
    while(sc.hasNext()) {
      String str = sc.next();
      String[] strArr = str.split(",");
      if (strArr[1].equals("A")) {
        counter[0]++;
      }
      else if (strArr[1].equals("B")) {
        counter[1]++;
      }
      else if (strArr[1].equals("AB")) {
        counter[2]++;
      }
      else {
        counter[3]++;
      }
    }
    for (int i = 0; i < 4; i++) {
      System.out.println(counter[i]);
    }
  }
}