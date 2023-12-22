import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int x,y,t,lastx,lasty,lastt,dist;
    lastt = 0; lastx = 0; lasty = 0;
    for (int i = 0; i < n; i++){
      t = Integer.parseInt(sc.next());
      x = Integer.parseInt(sc.next());
      y = Integer.parseInt(sc.next());
      dist = Math.abs(x-lastx) + Math.abs(y-lasty);
      if (!(dist <= (t-lastt) && (t-lastt-dist)%2 == 0)){
        System.out.println("No");
        return;
      }
      lastx = x; lasty = y; lastt = t;
    }
    System.out.println("Yes");
  }
}