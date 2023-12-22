import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] l = new int[n];
    int cnt = 0;
    
    for(int i=0; i < n; i++){
      l[i] = sc.nextInt();
    }
    
    for(int i = 0; i < n-2; i++){
      int li = l[i];
      for(int j = i+1; j < n-1; j++){
        int lj = l[j];
        if(li == lj){
          continue;
        }
        for(int k = j+1; k < n; k++){
		  int lk = l[k];
          if(li == lk || lj == lk){
            continue;
          }
          if((li + lj > lk) && (li + lk > lj) && (lj + lk > li))
            cnt++;
        }
      }
    }
    
    System.out.println(cnt);
  }
}