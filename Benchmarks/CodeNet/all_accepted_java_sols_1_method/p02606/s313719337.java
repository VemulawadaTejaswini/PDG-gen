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
    int L = scan.nextInt();
    int R = scan.nextInt();
    int d = scan.nextInt();
    int ans = 0;
    if (L % d == 0) {
      ans += 1;
    }
    L = L / d;
    R = R / d;
    ans += R - L;
    System.out.println(ans);
  }
}