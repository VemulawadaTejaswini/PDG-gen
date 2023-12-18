import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    long[] val = new long[n+1];
    for(int i=0;i<n+1;i++){
      val[i] = 0;
    }
    int[] a = new int[n];
    
    int tmp;
      
    for(int i=0;i<n;i++){
      tmp = sc.nextInt();
      a[i] = tmp;
      val[tmp] += 1;
    }
    
    long ans =0;
    for(int k=1;k<n+1;k++){
      ans += val[k]*(val[k]-1)/2;
    }
    
    long g =0;
    for(int j=0;j<n;j++){
      g = val[a[j]] -1 ;
      System.out.println(ans - g);
    }
      
      
   
  }
}