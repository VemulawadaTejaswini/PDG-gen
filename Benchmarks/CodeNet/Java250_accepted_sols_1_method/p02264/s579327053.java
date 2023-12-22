import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.LinkedList;

public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line = br.readLine().split(" ");
    int n = Integer.parseInt(line[0]);
    int q = Integer.parseInt(line[1]);
    LinkedList<String> queue = new LinkedList<String>();
    int time = 0;
    int cnt = n;
    Map<String, Integer> map = new HashMap<>();

    for(int i = 0; i < n; i++){
      line = br.readLine().split(" ");
      map.put(line[0], Integer.parseInt(line[1]));
      queue.add(line[0]);
    }

    while(true){
      String x = queue.poll();
      if(map.get(x) > q){
        time += q;
        map.put(x, map.get(x) - q);
        queue.add(x);
      }else{
        time += map.get(x);
        map.put(x, time);
        System.out.println(x + " " + map.get(x));
        n--;
      }
      if(n == 0)  break;
    }
  }
}