import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] juice = new int[n];
    int ans = 0;
    
    for(int i = 0;i < n; i++){
      juice[i] = sc.nextInt();
    }
    
    Arrays.sort(juice);
    
    for(int i = 0;i < k; i++){
      ans += juice[i];
    }
      System.out.println(ans);
    
  }  
}