import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i = 0 ; i < n ; ++i){
      a[i] = sc.nextInt();
    }
    
    Arrays.sort(a);
    
    int ans = 0;

    for(int i = 0 ; i < n ; ++i){
      int count = 1;
      for(int j = i+1 ; j < n ; ++j){
        if(a[i]==a[j]){
          count++;
        }else{
          
          break;
        }
      }
      i+=count-1;
      if(count%2==1){
        ans++;
      }
    }
    System.out.println(ans);    
  }
}