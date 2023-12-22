import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();
    
    List<Integer> healths = new ArrayList<Integer>();
    for (int i=0; i<n; i++) {
      int h = sc.nextInt();
      healths.add(h);
    }
    
    Collections.sort(healths, Collections.reverseOrder());
    long result = 0;
    for (Integer health : healths) {
      if (k>0) {
        k --;
      }
      else {
        result += health;
      }
    }
    
    System.out.println(result);
    
  }
}