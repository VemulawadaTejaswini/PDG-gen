import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i = 0;i<n;i++){
      a[i] = sc.nextInt();
    }
    int ans = 0;
    for(int i = 0;i<n;i++){
      if(a[i]%2==1){
        continue;
      }else if(a[i]%3==0||a[i]%5==0){
        continue;
      }else{
        ans = 1;
        break;
      }
    }
    if(ans == 0){
      System.out.println("APPROVED");
    }else{
      System.out.println("DENIED");
    }
  }
}
