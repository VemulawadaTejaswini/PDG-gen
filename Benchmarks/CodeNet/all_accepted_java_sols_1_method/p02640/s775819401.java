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
    int Y = scan.nextInt();
    int tsuru = 0;
    int kame = 0;
    int leg = 0;
    for (int i = 0;i <= X;i++) {
      tsuru = i;
      kame = X - i;
      leg = tsuru * 2 + kame * 4;
      if (leg == Y) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}
