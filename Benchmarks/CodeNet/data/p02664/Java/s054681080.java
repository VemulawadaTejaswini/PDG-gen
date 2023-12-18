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
    String T = scan.next();
    int N = T.length();
    String[] split = T.split("");
    for (int i = 0;i < N; i++) {
      if (split[i].equals("?")) {
        split[i] = "D";
      }
    }
     StringJoiner str = new StringJoiner("");
    for (String s : split) {
      str.add(s);
    }
    System.out.println(str.toString());    
  }
}
