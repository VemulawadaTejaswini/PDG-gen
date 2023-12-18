import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean flg = true;
    ArrayList<List<Integer>> list = new ArrayList<>();

    while(flg) {
      int h = sc.nextInt();
      int w = sc.nextInt();

      if(h == 0 && w == 0) {
        flg = false;
        sc.close();
        break;
      }

      List<Integer> data = new ArrayList<Integer>();
      data.add(h);
      data.add(w);
      list.add(data);
    }

    for(int i = 0; i < list.size(); i++) {
      int h = list.get(i).get(0);
      int w = list.get(i).get(1);
      for(int j = 0; j < h; j++) {
        for(int k = 0; k < w; k++) {
          if(j % 2 == 0) {
            if(k % 2 == 0) {
              System.out.print('#');
            } else {
              System.out.print('.');
            }
          } else {
            if(k % 2 == 0) {
              System.out.print('.');
            } else {
              System.out.print('#');
            }
          }
        }
        System.out.print("\n");
      }
      System.out.print("\n");
    }
  }
}
