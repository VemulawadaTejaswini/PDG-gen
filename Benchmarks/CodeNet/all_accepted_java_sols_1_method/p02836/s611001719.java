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
    int N = S.length();
    String[] split = S.split("");
    int count = 0;
    for (int i = 0;i < N/2;i++) {
      if (split[i].equals(split[N - 1 - i])) {
      }
      else{
        count++;
      }
    }
    System.out.println(count);
  }
}
