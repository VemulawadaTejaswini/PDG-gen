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
    String S = scan.next();
    String[] splitS = S.split("");
    String T = scan.next();
    String[] splitT = T.split("");
    StringBuilder sb = new StringBuilder();
    for (int i = 0;i < N;i++) {
      sb.append(splitS[i]);
      sb.append(splitT[i]);
    }
    System.out.println(sb);
  }
}
