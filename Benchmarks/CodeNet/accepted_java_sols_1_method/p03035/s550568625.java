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
    int A = scan.nextInt();
    int B = scan.nextInt();
    if (A >= 13) {
      System.out.println(B);
    }
    else if (A <= 5) {
      System.out.println(0);
    }
    else{
      B = B / 2;
      System.out.println(B);
    }
  }
}
