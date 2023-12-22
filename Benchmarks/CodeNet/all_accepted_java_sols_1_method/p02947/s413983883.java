import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    HashMap<String, Integer> map = new HashMap<>();
    for(int i = 0; i < n; i++){
      char[] a = scn.next().toCharArray();
      Arrays.sort(a);
      map.merge(new String(a), 1, Integer::sum);
    }
    
    long x = 0;
    for(String s : map.keySet()){
      long v = map.get(s);
      x += v * (v - 1) / 2;
    }
    System.out.println(x);
  }
}