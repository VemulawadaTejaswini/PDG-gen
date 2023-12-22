import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    int ans = 0;
    boolean zero = false;
    int min = 50000;
    int max = -50000;
    for (int i=1;i<=N;i++){
      ans += i + L-1;
      
      min = Math.min(min,(i+L-1));
      max = Math.max(max,(i+L-1));
      if ((i+L-1) == 0){
        zero = true;
      }
    }
    
    if (zero){
     
    }else{
      if (Math.abs(min) <= Math.abs(max)){
        ans -= min;
      }else{
        ans -= max;
      }
    }
    System.out.println(ans);
    
  }
}