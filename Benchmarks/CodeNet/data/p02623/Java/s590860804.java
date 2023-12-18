import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    
    int[] nbooks = new int[n];
    for(int i = 0; i<n; i++) {
      nbooks[i] = sc.nextInt();
    }

    int[] mbooks = new int[m];
    for(int i = 0; i<m; i++) {
      mbooks[i] = sc.nextInt();
    }

    
    int out = 0;
    
    int ni = 0;
    int mi = 0;
    
    long time = 0;
    
    while(ni < n || mi < m) {
      int nextbook = 0;
      if(ni<n) nextbook = nbooks[ni];
      if(mi<m && (mbooks[mi] < nextbook || nextbook == 0)) nextbook = mbooks[mi];
      
      if(time+nextbook > k) {
        break;
      }
      else {
        time = time+nextbook;
        out++;
        if(ni< n && nextbook == nbooks[ni]) ni++;
        else if(mi<m && nextbook == mbooks[mi])mi++;
      }
    }
    
    System.out.println(out);
  }
}
