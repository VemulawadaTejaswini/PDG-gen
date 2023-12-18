import java.util.*;

public class Main {
  Scanner sc;
  
  static int M, T, P, R;
  void run() {
    while(true){
      M = ni();
      T = ni();
      P = ni();
      R = ni();
      if(M==0&&T==0&&P==0&&R==0)break;
      Team[] team = new Team[T];
      for(int i=0;i<T;i++){
        team[i] = new Team(i);
      }
      for(int i=0;i<R;i++){
        int m = ni();
        int t = ni();
        int p = ni();
        int j = ni();
        if(j==0){
          team[t-1].ans++;
          int tt = (team[t-1].submits[p-1])*20;
          team[t-1].time += (tt + m);
        }else{
          team[t-1].submits[p-1]++;
        }
      }
      Arrays.sort( team, new Comparator<Team>(){
        public int compare(Team t1, Team t2){
          if(t1.ans == t2.ans){
            if(t1.time == t2.time){
              return t2.number - t1.number;
            }else{
              return t1.time - t2.time;
            }
          }else{
            return t2.ans - t1.ans;
          }
        }
      });
//      for(Team tm : team)System.out.println(tm);
      System.out.print(team[0].number+1);
      for(int i=1;i<T;i++){
        if(team[i-1].ans == team[i].ans && team[i-1].time == team[i].time){
          System.out.printf("=%d", team[i].number+1);
        }else{
          System.out.printf(",%d", team[i].number+1);
        }
      }
      System.out.println();
    }
  }
  
  Main() {
    sc = new Scanner(System.in);
  }
  
  int ni() {
    return sc.nextInt();
  }
  
  public static void main(String[] args) {
    new Main().run();
  }
  
  void debug(Object... os) {
    System.err.println(Arrays.deepToString( os ));
  }
}
class Team{
  public int number;
  public int time;
  public int ans;
  public int[] submits;
  public Team(int number){
    this.number = number;
    submits = new int[Main.P];
    
  }
  public String toString(){
    return String.format("%2d, %4d, %2d, %s", number, time, ans, Arrays.toString(submits));
  }
}