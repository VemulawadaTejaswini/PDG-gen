import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    Collections.sort(list);

    Iterator<Integer> iter = list.iterator();
    while(iter.hasNext()) {
      System.out.print(iter.next());
      if(iter.hasNext()) {
        System.out.print(" ");
      }
    }
    System.out.print("\n");
  }
}