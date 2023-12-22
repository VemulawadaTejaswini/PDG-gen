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
    int N = scan.nextInt();
    if (N > 81) {
      System.out.println("No");
      return;
    }
    for (int i = 1;i < 10;i++) {
      if (N % i == 0) {
        if (N / i < 10) {
          System.out.println("Yes");
          return;
        }
      }
    }
    System.out.println("No");
  }
}
