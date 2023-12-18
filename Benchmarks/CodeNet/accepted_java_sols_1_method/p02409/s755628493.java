import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    ArrayList<Integer> t1 = new ArrayList<Integer>();
    ArrayList<Integer> t2 = new ArrayList<Integer>();
    ArrayList<Integer> t3 = new ArrayList<Integer>();
    ArrayList<Integer> t4 = new ArrayList<Integer>();
    for (int i = 1; i <= 30; i++) {
      t1.add(0);
      t2.add(0);
      t3.add(0);
      t4.add(0);
    }

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    for (int i = 0; i < n; i++) {
      int b = scan.nextInt();
      int f = scan.nextInt();
      int r = scan.nextInt();
      int v = scan.nextInt();

      switch (b) {
      case 1:
        t1.set((f-1) * 10 + (r-1), t1.get((f-1) * 10 + (r-1)) + v);
        break;

      case 2:
        t2.set((f-1) * 10 + (r-1), t2.get((f-1) * 10 + (r-1)) + v);
        break;

      case 3:
        t3.set((f-1) * 10 + (r-1), t3.get((f-1) * 10 + (r-1)) + v);
        break;

      case 4:
        t4.set((f-1) * 10 + (r-1), t4.get((f-1) * 10 + (r-1)) + v);
        break;
      }

    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 9; j++) {
        System.out.print(" " + t1.get(10 * i + j));
      }
      System.out.println(" " + t1.get(10 * i + 9));
    }

    for (int i = 0; i < 20; i++) {
      System.out.print("#");
    }
    System.out.println();

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 9; j++) {
        System.out.print(" " + t2.get(10 * i + j));
      }
      System.out.println(" " + t2.get(10 * i + 9));
    }

    for (int i = 0; i < 20; i++) {
      System.out.print("#");
    }
    System.out.println();
    
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 9; j++) {
        System.out.print(" " + t3.get(10 * i + j));
      }
      System.out.println(" " + t3.get(10 * i + 9));
    }

    for (int i = 0; i < 20; i++) {
      System.out.print("#");
    }
    System.out.println();
    
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 9; j++) {
        System.out.print(" " + t4.get(10 * i + j));
      }
      System.out.println(" " + t4.get(10 * i + 9));
    }

  }

}
