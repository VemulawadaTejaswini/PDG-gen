import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

  static int n;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Set<String> s = new HashSet<>();

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);

    for(int i = 0; i < n; i++){

      in = br.readLine().split(" ");
      s.add(in[0]);
    }

    br.close();

    System.out.println(s.size());
    
  }
}