import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[];
    a = new int[3];
    a[0] = Integer.parseInt(sc.next());
    a[1] = Integer.parseInt(sc.next());
    a[2] = Integer.parseInt(sc.next());
    Arrays.sort(a);
    System.out.println(a[0] + " " + a[1] + " " + a[2]);
  }
}