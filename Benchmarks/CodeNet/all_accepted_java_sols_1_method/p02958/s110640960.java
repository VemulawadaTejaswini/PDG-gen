import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
    int p[] = new int[n];
    int pc[] = new int[n];
    int swapa = 0;
    int swapb = 0;
    int flg = 0;
    
    for (int i=0; i<n; i++){
      p[i] = Integer.parseInt(sc.next());
    }
    
    for (int i=0; i<n; i++){      
      swapa = p[i];
      
      for (int j=i; j<n; j++){
        for (int ii=0; ii<n; ii++){
          pc[ii] = p[ii];
      	}
        
        swapb = p[j];
        pc[j] = swapa;
        pc[i] = swapb;
        
        flg = 0;
        for (int k=0; k<n-1; k++){
          if (pc[k] > pc[k+1]) {
            flg++;
          }
        }
        if (flg==0){
          System.out.println("YES");
          return;
        }
      }
    }

	System.out.println("NO");


  }
}
