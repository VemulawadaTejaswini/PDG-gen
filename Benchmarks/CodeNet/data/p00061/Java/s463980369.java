import java.util.*;

class Main{
  static class Team implements Comparable<Team> {
    public int id;
    public int pt;
    public Team(int id, int pt) {
      this.id = id;
      this.pt = pt;
    }
    public int compareTo( Team o ) {
      return o.pt-pt;
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    List<Team> list = new ArrayList<Team>();
    while(true) {
      String str = sc.next();
      String[] strArr = str.split(",");
      int id = Integer.parseInt(strArr[0]);
      int pt = Integer.parseInt(strArr[1]);
      if (id == 0 && pt == 0){
        break;
      }
      list.add(new Team(id,pt));
    }
    Collections.sort(list);
    while (sc.hasNext()){
      int id = sc.nextInt();
      int rank = 0;
      int temp = -1;
      for (int i = 0; i < list.size(); i++) {
        Team team = list.get(i);
        if (temp != team.pt) {
          rank++;
          temp = team.pt;
        }
        if (id == team.id) {
          System.out.println(rank);
        }
      }
    }
  }
}