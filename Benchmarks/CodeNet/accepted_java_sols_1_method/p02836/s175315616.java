import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    
    int sHalfLength = s.length() / 2;
    String sFront = "";
    String sBack = "";
    int count = 0;
    
    if (s.length() % 2 == 0) {
      sFront = s.substring(0, sHalfLength);
      sBack = s.substring(sHalfLength, s.length());
      for (int i = 0; i < sHalfLength; i++) {
        if (sFront.substring(i, i+1).equals(sBack.substring(sHalfLength - i - 1, sHalfLength - i))) {
        } else {
          count++;
        }
      }
    } else {
      sFront = s.substring(0, sHalfLength);
      sBack = s.substring(sHalfLength + 1);
      for (int i = 0; i < sHalfLength; i++) {
        if (sFront.substring(i, i+1).equals(sBack.substring(sHalfLength - i - 1, sHalfLength - i))) {
        } else {
          count++;
        }
      }
    }
    System.out.println(count);
  }
}