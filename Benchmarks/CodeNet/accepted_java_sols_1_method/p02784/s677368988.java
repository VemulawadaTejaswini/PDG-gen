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
    int H = scan.nextInt();
    int N = scan.nextInt();
    int A[] = new int[N];
    int sum = 0;
    for (int i = 0; i < N; i++) {
      A[i] = scan.nextInt();
      sum += A[i];
    }
    if (sum >= H) {
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
