import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main { 
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.next());
      List<String> list = new ArrayList<String>();
      for(int i = 0; i < N; i++){
        list.add(sc.next());
      }
      List<String> L = new ArrayList<String>(new HashSet<>(list));
      System.out.println(L.size());
    }
}
