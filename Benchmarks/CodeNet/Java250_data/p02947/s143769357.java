import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.io.PrintWriter;

public class Main { //クラス名はMain
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      PrintWriter out = new PrintWriter(System.out);
      int num = Integer.parseInt(sc.next());
      Map<String, Integer> map = new HashMap<>();
      long ans = 0;
      for(int i = 0;i<num;i++){
        char[] c = sc.next().toCharArray();
        Arrays.sort(c);
        String str = String.valueOf(c);
        if(map.containsKey(str)){
          int v = map.get(str);
          ans += v;
          map.put(str,v+1);
        }else map.put(str,1);
      }
      out.println(ans);
      out.flush();
    }
}
