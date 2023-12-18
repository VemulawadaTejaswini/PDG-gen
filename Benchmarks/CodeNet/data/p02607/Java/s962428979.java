import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[N+1];
    int cnt = 0;
    
    for(int i=1; i<=N; i++){
      a[i]=sc.nextInt();
      if(i%2==1 && a[i]%2==1){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
    