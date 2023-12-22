import java.util.*;

public class Main {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();
          Set<String> present = new HashSet<String>();
          for(int i = 0; i < num; i++){
             present.add(sc.next());
          }
          System.out.println(present.size());
          }
          }
