import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    int N = 7;
    if (S.equals("SUN")) {
      System.out.println(N);
    }
    else if (S.equals("MON")) {
      System.out.println(N-1);
    }
    else if (S.equals("TUE")) {
      System.out.println(N-2);
    }
    else if (S.equals("WED")) {
      System.out.println(N-3);
    }
    else if (S.equals("THU")) {
      System.out.println(N-4);
    }
    else if (S.equals("FRI")) {
      System.out.println(N-5);
    }
    else{
      System.out.println(N-6);
    }
  }
}
