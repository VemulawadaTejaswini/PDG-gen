import java.util.*;

class Main{
  public static void swapBall(String[] strArr, boolean[] ball){
    Arrays.sort(strArr);
    if(Arrays.binarySearch(strArr, "A") >= 0) {
      ball[0] = !ball[0];
    }
    if(Arrays.binarySearch(strArr, "B") >= 0) {
      ball[1] = !ball[1];
    }
    if(Arrays.binarySearch(strArr, "C") >= 0) {
      ball[2] = !ball[2];
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    boolean[] ball = {true, false, false};
    while(sc.hasNext()) {
      String str = sc.next();
      String[] strArr = str.split(",");
      swapBall(strArr, ball);
    }
    if (ball[0]) {
      System.out.println("A");
    }
    else if (ball[1]) {
      System.out.println("B");
    }
    else {
      System.out.println("C");
    }
  }
}