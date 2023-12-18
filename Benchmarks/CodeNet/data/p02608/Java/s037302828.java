import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int cnt = 0;
    
    int[] twelve = {0,0,0,0,0,1,0,0,0,0,3,0,0,0,0,0,3,3,0,0};
    
    for(int i=0; i<n; i++){
      System.out.println(twelve[i]);
      if(i==19)
        break;
    }
    
    if(n<=20)
      return;
    
    int sq = (int)Math.sqrt(n);
    
    for(int c=1; c<=n; c++){
      for(int i=1; i <= sq; i++){
        int ii = c - i*i;
          if(ii - i <= 0)
            break;
        for(int j=i; j<= sq; j++){
          int ij = (ii - j*j - i*j);
          if(ij - i - j <= 0)
            break;
          for(int k=j; k<=sq; k++){
            int ijk = (ij - k*k - i*k - j*k);
            if(0 == ijk) {
              cnt++;
              break;
            }
          }
        }
      }
      System.out.println(cnt);
      cnt = 0;
    }
  }
}