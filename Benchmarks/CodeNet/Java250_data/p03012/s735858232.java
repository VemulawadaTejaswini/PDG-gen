import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    
    for(int i=0; i<n; i++){
      a[i] = Integer.parseInt(sc.next());
    } 
    int res = 0;
    for(int j=0; j<n; j++){
      res += a[j];
    }

    int ans1=0, ans2=0;
    for(int k=0; k<n; k++){
      ans1 += a[k];
      ans2 += a[k];
      if(ans1 > res/2){
        ans2 -= a[k];
        break;
      }
    }

    System.out.println(Math.min(2*ans1-res, res-2*ans2));

  }
}