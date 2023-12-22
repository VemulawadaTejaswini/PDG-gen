import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt() - 1;
    int y = sc.nextInt() - 1;
    
    int[] ans = new int[n];
    int k;
    
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        k = Math.min(Math.abs(i-x)+1+Math.abs(j-y),j-i);
        ans[k] += 1;
      }
    }
    
    
    for(int i=1;i<n;i++){
      System.out.println(ans[i]);
    }

  }
}