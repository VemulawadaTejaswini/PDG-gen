import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    String s = sc.next();

    String check = "";
    int todot = 0;
    int current;
    int min;

    for (int i=0; i<n; i++) {
      check = s.substring(i,i+1);
      if (check.equals(".")) {
        todot++;
      }
    }
    
    current = todot;
    min = todot;
    
	for (int i=0; i<n; i++) {
      check = s.substring(i,i+1);
      if (check.equals(".")) {
        current--;
      } else {
        current++;
      }
      if (current < min) {
        min = current;
      }
    }
    
    System.out.println(min);
  }
}
