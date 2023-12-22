import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    int cnt[] = new int[n];
    for(int i=0;i<n;i++){
      while(a[i]%2==0){
        a[i]=a[i]/2;
        cnt[i]=cnt[i]+1;
      }
    }
    int answer =0;
    for(int i=0;i<n;i++){
      answer = answer + cnt[i];
    }
    System.out.println(answer);
    
  }
  

  
}