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
    int X = scan.nextInt();
    int N = scan.nextInt();
    Integer p[] = new Integer[N];
    int mid = N + 1;
    int k = 0;
    int h = 0;
    int ans1 = 101;
    int ans2 = 101;
    for (int i = 0;i < N;i++) {
      p[i] = scan.nextInt();
    }
    Arrays.sort(p, Collections.reverseOrder());
    for (int i = 0; i < N - 1; i++){
      if (p[i] == p[i + 1]){
        p[i] = X;
      }
    }
    for (int i = 0;i < N;i++) {
      if (p[i] == X) {
        mid  = i;
      }
    }
    if (mid == N + 1) {
      if (X >= 0) {
        System.out.println(X);
        return;
      }
    }
    else{
      for (int i = mid + 1;i < N;i++) {
        k++;
        if (p[i] != X - k) {
          ans1 = X - k;
          break;
        }        
      }
      for (int i = mid - 1;i >= 0;i--) {
        h++;
        if (p[i] != X + h) {
          ans2 = X + h;
          break;
        }
      }
      if (ans2 == 101) {
        ans2 = p[0] - 1;
      }
      else if (ans1 == 101) {
        ans1 = p[N - 1] - 1;
      }
      else{
      }
      if (Math.abs(ans2 - X) == Math.abs(X - ans1)) {
        System.out.println(ans1);
      }
      else if(Math.abs(ans2 - X) > Math.abs(X - ans1)) {
        System.out.println(ans1);
      }
      else if (Math.abs(ans2 - X) < Math.abs(X - ans1)) {
        System.out.println(ans2);
      }
    }
  }
}

