import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] head = br.readLine().split(" ");
    int h = Integer.parseInt(head[0]);
    int w = Integer.parseInt(head[1]);
    int[][] ab = new int[h][2];
    for(int i = 0; i < h; i++){
      String[] data = br.readLine().split(" ");
      ab[i][0] = Integer.parseInt(data[0]);
      ab[i][1] = Integer.parseInt(data[1]);
    }
    br.close();

    // key:終点のH座標、value:始点のH座標
    SortedMap<Integer, Integer> routeMap = new TreeMap<>();
    SortedMap<Integer, Integer> distMap = new TreeMap<>();

    for(int num = 1; num <= w; num++){
      routeMap.put(num, num);
    }
    distMap.put(0, w);

    PrintWriter pw = new PrintWriter(System.out);
    for(int i = 0; i < h; i++){
      int from = ab[i][0];
      int to = ab[i][1];
      SortedMap<Integer, Integer> subMap = routeMap.subMap(from, to + 1);
      if(to < w && !routeMap.containsKey(to + 1) && !subMap.isEmpty()){
        int dist = to + 1 - subMap.get(subMap.lastKey());
        routeMap.put(to + 1, subMap.get(subMap.lastKey()));
        if(distMap.containsKey(dist)){
          distMap.put(dist, distMap.get(dist) + 1);
        } else {
          distMap.put(dist, 1);
        }
      }
      for(Integer key : subMap.keySet()){
        int dist = key - subMap.get(key);
        if(distMap.get(dist) == 1){
          distMap.remove(dist);
        } else {
          distMap.put(dist, distMap.get(dist) - 1);
        }
      }
      subMap.clear();

      if(distMap.isEmpty()){
        pw.println(-1);
      } else {
        pw.println(distMap.firstKey() + i + 1);
      }
    }
    pw.close();
  }
}