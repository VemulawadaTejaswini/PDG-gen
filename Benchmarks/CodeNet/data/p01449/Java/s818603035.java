import java.util.*;
import java.io.*;

public class Main{
  static int n;
  static int[] t;
  static boolean[] used;

  static int dfs(int id, boolean[] passed){
    if(t[id] == 0){
      return id;
    }
    if(used[id]){
      if(!passed[id]){
        return t[id];
      }
      return -1;
    }

    used[id] = passed[id] = true;
    t[id] = dfs(id + t[id], passed);

    return t[id];
  }

  static int dijk(){
    boolean[] closed = new boolean[n + 2];
    PriorityQueue<State> open = new PriorityQueue<State>();

    open.add(new State(0, 0));

    while(!open.isEmpty()){
      State st = open.poll();

      if(st.id == n - 1) return st.cost;
      if(closed[st.id]) continue;
      closed[st.id] = true;

      if(used[st.id]){
        if(t[st.id] == -1) continue;
        open.add(new State(t[st.id], st.cost));
      }
      else{
        for(int i = 1; i <= 6; i++){
          if(st.id + i >= n) break;
          open.add(new State(st.id + i, st.cost + 1));
        }
      }
    }

    return -1;
  }

  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while(br.ready()){
      n = Integer.parseInt(br.readLine());
      t = new int[n + 2];
      used = new boolean[n + 2];

      for(int i = 0; i < n; i++){
        t[i] = Integer.parseInt(br.readLine());
      }

      for(int i = 0; i < n; i++){
        if(t[i] != 0 && !used[i]){
          dfs(i, new boolean[n]);
        }
      }

      System.out.println(dijk());
    }
  }
}

class State implements Comparable<State>{
  int id, cost;

  State(int id, int cost){
    this.id = id;
    this.cost = cost;
  }

  public int compareTo(State st){
    return this.cost - st.cost;
  }
}