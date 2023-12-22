import java.util.*;
import java.io.*;

public class Main {

 public static void main(String[] args) {
     
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    HashMap<Integer,Integer> map = new HashMap();
    //System.out.println(N);
    
    for(int i = 1; i <= N-1; i++) {
        int n = in.nextInt();
        if(map.containsKey(n)) map.put(n, map.get(n)+1);
        else map.put(n, 1);
    }
    
    for(int i = 1; i <= N; i++){
        if(map.containsKey(i)) {
            System.out.println(map.get(i));
        }
        else {
            System.out.println(0);
        }
    }
    
  }
  
}