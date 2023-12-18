import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int h = sc.nextInt();
    int n = sc.nextInt();
    
    for (int i=0; i<n; i++) {
      int a = sc.nextInt();
      h -= a;
      if (h<=0) {
        break;
      }
    }
    
    String result;
    if (h<=0) {
      result = "Yes";
    }
    else {
      result = "No";
    }

    
    System.out.println(result);
    
  }
}