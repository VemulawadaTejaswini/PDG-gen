import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count =0;
    int check =0;
    ArrayList<Integer> t = new ArrayList<Integer>();
    ArrayList<Integer> x = new ArrayList<Integer>();
    ArrayList<Integer> y = new ArrayList<Integer>();
    ArrayList<Integer> z = new ArrayList<Integer>();
    while (sc.hasNext()) {
      count++;
      t.add(sc.nextInt());
      x.add(sc.nextInt());
      y.add(sc.nextInt());
    }
    for (int i =0; i<count; i++) {
      int ttmp = t.get(i);
      int xtmp = x.get(i);
      int ytmp = y.get(i);
      z.add(xtmp + ytmp);
      
      if (xtmp+ytmp > ttmp) break;
      if ((ttmp+xtmp+ytmp) % 2 == 1) break;
      if (i>0) {
        int ztmp = z.get(i-1);
        int interval = Math.abs(xtmp + ytmp - ztmp);
        if (interval > ttmp - t.get(i-1)) break;
      }
      check++;
    } 
      if (check == count ) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
  }
}