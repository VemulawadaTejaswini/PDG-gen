import java.util.*;

public class Main{
  static int w,h,f,m,o;
  static int[][] t;
  static int dx[] = {-1,1};

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      w = sc.nextInt();
      h = sc.nextInt();
      if(w == 0 && h == 0) break;

      f = sc.nextInt();
      m = sc.nextInt();
      o = sc.nextInt();
      t = new int[h][w];

      for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
          t[i][j] = sc.nextInt();
        }
      }

      PriorityQueue<State> open = new PriorityQueue<State>();
      HashSet<State> closed = new HashSet<State>();
      for(int i=0;i<w;i++){
        int cost = t[0][i];
        if(cost < 0){
          open.add(new State(-cost,i,0,i,i,o-1));
        }
        else{
          int no = o + cost;
          if(no > m) no = m;
          open.add(new State(0,i,0,i,i,no));
        }
      }

      State ans = null;
      while(!open.isEmpty()){
        State st = open.poll();
        if(closed.contains(st)) continue;
        closed.add(st);

        //System.out.println(st);

        if(st.y == h-1 && st.o > 0 && st.cost <= f){
          ans = st;
          break;
        }
        if(st.y == h-1) continue;
        if(st.cost > f || st.o == 0) continue;

        int tt = t[st.y+1][st.x];
        if(tt < 0){
          open.add(new State(st.cost-tt,st.x,st.y+1,st.x,st.x,st.o-1));
        }
        else{
          int no = st.o + tt - 1;
          if(no > m) no = m;
          open.add(new State(st.cost,st.x,st.y+1,st.x,st.x,no));
        }

        for(int i=0;i<2;i++){
          int nx = st.x + dx[i];
          int ny = st.y;
          if(nx < 0 || nx >= w) continue;

          if(st.l <= nx && nx <= st.r){
            open.add(new State(st.cost,nx,ny,st.l,st.r,st.o-1));
          }
          else{
            tt = t[ny][nx];
            int nl = Math.min(st.l,nx);
            int nr = Math.max(st.r,nx);
            if(tt < 0){
              open.add(new State(st.cost-tt,nx,ny,nl,nr,st.o-1));
            }
            else{
              int no = st.o + tt - 1;
              if(no > m) no = m;
              open.add(new State(st.cost,nx,ny,nl,nr,no));
            }
          }
        }
      }

      if(ans == null){
        System.out.println("NA");
      }
      else{
        System.out.println(ans.cost);
      }
    }
  }
}

class State implements Comparable<State>{
  int cost,x,y,l,r,o;

  State(int cost,int x,int y,int l,int r,int o){
    this.cost = cost;
    this.x = x;
    this.y = y;
    this.l = l;
    this.r = r;
    this.o = o;
  }

  public boolean equals(Object O){
    State st = (State)O;
    return x == st.x && y == st.y && l == st.l && r == st.r && o == st.o;
  }

  public int hashCode(){
    return x + y*10 + l*1000 + r*100000 + o * 10000000;
  }

  public int compareTo(State st){
    return this.cost - st.cost;
  }

  public String toString(){
    return String.format("(%d,%d) (%d<-->%d) (cost:%d,o:%d)",x,y,l,r,cost,o);
  }
}