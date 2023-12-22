import java.util.*;
 
public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);    
    
    int N = sc.nextInt();

    Set<Integer> treeSet = new TreeSet<Integer>();

    for (int i = 0; i < N; i++) {
      treeSet.add(sc.nextInt());
    }

    sc.close();

    int s = treeSet.size();

    if (s % 2 == 0) {
      System.out.println(s - 1);
    } else {
      System.out.println(s);
    }

  }

}