import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int l = sc.nextInt();
    
    int x = Math.abs(l);
    int k = 1;
    
    for(int i=2; i<=n; i++){
      if(x>Math.abs(l+i-1)){
        x = Math.abs(l+i-1);
        k = i;
      }
    }
    
    int ans = 0;
    
    for(int i=1; i<=n; i++){
      if(i!=k){
        ans += (l+i-1);
      }
    }
    
    System.out.println(ans);
  }
}