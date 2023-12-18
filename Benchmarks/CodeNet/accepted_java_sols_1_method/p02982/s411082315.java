import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
    int d = Integer.parseInt(sc.next());
    
    int x[][] = new int[n][d];
    int dis = 0;
    int ans = 0;
    
    for (int i=0; i<n; i++){
      for (int j=0; j<d; j++){
        x[i][j] = Integer.parseInt(sc.next());
      }
    }

    for (int i=0; i<n; i++){
      for (int j=i+1; j<n; j++){
        dis = 0;
          
        for (int k=0; k<d; k++){
          dis += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
        }
        for (int a=1; a<=Math.sqrt(dis); a++) {
       	  if (dis == a*a) ans++;
        }
        
      }
    }
    
    System.out.println(ans);

  }
}
