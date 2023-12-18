import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    
    int s = 0;
    int t = 0;
    double p = 0;
    
    for (int i=1; i<=n; i++){
      s = i;
      
      if (s>=k) {
        p += 1d/n;
        continue;
      }
      
      for (int j=1; j<21; j++){
        s = s*2;
        
        if (s>=k) {
          p += (1d/n) * Math.pow(0.5d, j);
          break;
        }
        
      }
    }
    
    System.out.println(p);
  }
}
