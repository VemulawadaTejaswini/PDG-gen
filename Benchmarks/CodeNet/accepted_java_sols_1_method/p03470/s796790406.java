import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> dups = new ArrayList<Integer>();
    ArrayList<Integer> list = new ArrayList<Integer>();
    int N = sc.nextInt();
    for(int i = 0; i < N; i++) {
      int curr = sc.nextInt();
      if(!list.contains(curr)) {
        list.add(curr);
      }
    }
    System.out.println(list.size());
  }
}
