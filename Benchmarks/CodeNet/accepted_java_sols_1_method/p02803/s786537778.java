import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    HashMap<Integer, List<Integer>> routes = new HashMap<Integer, List<Integer>>();
    
    for (int i=0; i<h; i++) {
      String row = sc.next();
      for (int j=0; j<w; j++) {
        char c = row.charAt(j);
        if (c=='.') {
          List<Integer> tmp = new ArrayList<Integer>();
          routes.put(i*w+j, tmp);
          
          if (i!=0) {
            if (routes.containsKey((i-1)*w+j)) {
              tmp.add((i-1)*w+j);
              routes.get((i-1)*w+j).add(i*w+j);
            }
          }
          
          if (j!=0) {
            if (routes.containsKey(i*w+j-1)) {
              tmp.add(i*w+j-1);
              routes.get(i*w+j-1).add(i*w+j);
            }
          }
        }
      }
    }
    
    int max = 1;
    if (routes.size()==h*w) {
      max = h + w -2;
    }
    else {
    for (int i=0; i<h*w; i++) {
      for (int j=i+1; j<h*w; j++) {
        if (!routes.containsKey(i)) {
          continue;
        }
        if (!routes.containsKey(j)) {
          continue;
        }
        HashMap<Integer, Integer> already = new HashMap<Integer,Integer>();
        Deque<Integer> queue = new ArrayDeque<Integer>();
        
        queue.offer(i);
        already.put(i, 0);
        while(!queue.isEmpty()) {
          int current = queue.poll();
          List<Integer> way = routes.get(current);
          for (Integer k : way) {
            if (already.containsKey(k)) {
              continue;
            }
            queue.offer(k);
            already.put(k, already.get(current)+1);
          }
        }
        
        if (max<already.get(j)) {
          max = already.get(j);
        }
      }
    }  
    }
    
    
    
    

    System.out.println(max);
  }
}