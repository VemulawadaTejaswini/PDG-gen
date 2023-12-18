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
    int K = scan.nextInt();
    int h[] = new int[N];
    int count = 0;
    for (int i = 0;i < N;i++) {
      h[i] = scan.nextInt();
      if (h[i] >= K) {
        count += 1;
      }
    }
    System.out.println(count);
  }
}
