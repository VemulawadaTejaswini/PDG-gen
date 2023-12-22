import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int x[] = new int[n];
    int y[] = new int[n];

    for(int i=0; i<n; i++){
      x[i] = Integer.parseInt(sc.next());
      y[i] = Integer.parseInt(sc.next());
    }
    
    double sum = 0;
    
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        //if(i>=j){
        //  continue;
        //}
        sum += Math.sqrt( (x[i]-x[j])*(x[i]-x[j]) + (y[i]-y[j])*(y[i]-y[j]) );
      }
    }
    
    double ans = sum * (n-1) / n / (n-1);
    
    System.out.println(ans);

  }
}
