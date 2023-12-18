import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    double p = 0.0;
    int pi = 0;

    for(int i=1; i<50001; i++){
      p = i * 1.08;
      pi = (int) p;
      if (pi == n){
        System.out.println(i);
        return;
      }
    }
    
    System.out.println(":(");
    
  }
}
