import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      ArrayList<Integer> mountains = new ArrayList<Integer>();
      for(int i = 0; i < 10; i++){
          mountains.add(sc.nextInt());
      }
      Collections.sort(mountains);
      Collections.reverse(mountains);
      for(int i = 0; i < 3; i++){
          System.out.println(mountains.get(i));
      }
    }
}