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
    int r = scan.nextInt();
    int D = scan.nextInt();
    int x = scan.nextInt();
    for (int i = 0;i < 10;i++) {
      x = r * x - D;
      System.out.println(x);
    }
  }
}
