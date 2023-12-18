import java.util.*;
import java.io.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();

    TreeMap<Integer, Integer> hashMap = new TreeMap<>();

    for (int i = 0; i < N; i++) {
      int A = sc.nextInt();
      hashMap.put(A,i);
    }

    sc.close();

    PrintWriter out = new PrintWriter(System.out);

    int length = hashMap.size();

    for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
      out.print(map.getValue() + 1);
      if(map.getKey() != length) {
        out.print(" ");
      }
    }

    out.println("");
    out.flush();
    
  }

}