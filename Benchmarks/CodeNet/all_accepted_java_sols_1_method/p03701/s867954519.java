import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] a1=new int[n];
    int ans = 0;
    
    for(int i=0;i<n;i++){
      a1[i]=sc.nextInt();
    }

    int total = 0;
    for(int j=0;j<n;j++){
      total += a1[j]; 
    }
    
    Arrays.sort(a1);
    if(total % 10 != 0){
      ans = total;
    }else{
      for (int k = 0; k < n; k++) {
        if (a1[k] % 10 != 0) {
          ans = total - a1[k];
          break;
        }
      }
    }
    System.out.println(ans);
  }
}
