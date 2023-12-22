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
    int n = scan.nextInt();
    String s = scan.next();
    String[] split = s.split("");
    int count = 1;
    for (int i = 1;i < n; i++) {
      if (split[i].equals(split[i - 1])) {
        split[i - 1] = "0";
      }
      else{
        count += 1;
      }
    }
    System.out.println(count);
  }
}