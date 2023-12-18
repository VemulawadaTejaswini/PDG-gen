import java.util.*;
import java.io.*;

public class Main{

  public static void main(String[] args){

    // scanner, writer
    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    
    // variables
    int n, m, a, b;
    int[] ans = new int[200001];
    List<List<Integer>> adjList = new ArrayList<>();
    Queue<Integer> next = new ArrayDeque<>();
    int tmp;

    Arrays.fill(ans, -1);

    // read
    n = Integer.parseInt(sc.next());
    m = Integer.parseInt(sc.next());
    for(int i = 0; i <= n; i++){
      adjList.add(new ArrayList<>());
    }
    for(int i = 0; i < m; i++){
      a = Integer.parseInt(sc.next());
      b = Integer.parseInt(sc.next());
      adjList.get(a).add(b);
      adjList.get(b).add(a);
    }

    // process
    next.add(1);
    while(next.peek() != null){
      tmp = next.poll();
      ArrayList<Integer> next_tmp = new ArrayList<Integer>(adjList.get(tmp));
      Iterator<Integer> it = next_tmp.iterator();
      while(it.hasNext()){
        int next_room = it.next();
        if(ans[next_room] == -1){
          ans[next_room] = tmp;
          next.add(next_room);
        }
      }
    }

    out.println("Yes");
    for(int i = 2; i <= n; i++){
      out.println(ans[i]);
    }

    // write
    out.flush();
  }

}
