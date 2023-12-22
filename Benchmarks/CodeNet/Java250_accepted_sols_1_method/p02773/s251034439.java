import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {



    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      int test = sc.nextInt();
        HashMap<String,Integer> hm = new HashMap<>();
        int max =0; int count=0;
      for(int ii=0; ii<test; ii++) {
          String s = sc.next();
          if (hm.containsKey(s)) {
              Integer x = hm.get(s);
              x++;
              hm.put(s, x);
              if (x == max)
                  count++;
              if (x > max)
                  max = x;
          } else {
              hm.put(s, 1);
              if (1 == max)
                  count++;
              if (1 > max)
                  max = 1;
          }
      }
    List<String> al = new ArrayList<>();
      for(Map.Entry<String,Integer> map : hm.entrySet()){
          int y = map.getValue();
          if(y == max)
            al.add(map.getKey());
      }
      Collections.sort(al);
      for(String xx : al)
          System.out.println(xx);

    }
}