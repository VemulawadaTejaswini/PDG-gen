import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String s = in.readLine();
    HashSet<String> hs = new HashSet<String>();
    int max = 0;
    
    for(int i=1; i<n; i++) {
      String s_bf = s.substring(0,i);
      String s_af = s.substring(i,n);
      hs.clear();
      for(int j=0; j<s_bf.length(); j++) {
        String x = s_bf.substring(j,j+1);
        if(s_af.contains(x))
          hs.add(x);
      }
      if(hs.size()>max)
        max = hs.size();
    }
    System.out.println(max);
  }
}