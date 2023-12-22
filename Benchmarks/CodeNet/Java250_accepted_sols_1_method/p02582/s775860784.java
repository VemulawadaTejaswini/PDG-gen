import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
import java.math.BigInteger;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    String[] split = S.split("");
    int count = 0;
    for (int i = 0;i < 3;i++) {
      if (split[i].equals("R")) {
        count += 1;
      }
    }
    if (S.equals("RSR")) {
      count -= 1;
    }
    System.out.println(count);
  }
}

