import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int n = sc.nextInt();
    System.out.println((h+n)%24);
  }
}
