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
    long N = scan.nextLong();
    int count = 0;
    for (int i = 1;i <= N;i++) {
      int a = scan.nextInt();
      if (a % 2 == 1 && i % 2 == 1) {
        count += 1;
      }
    }
    System.out.println(count);
  }
}