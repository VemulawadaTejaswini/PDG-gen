import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int cnt = 0;
    int max = 0;
    int next = 0;
    int maxi = 0;
    while(cnt<n){
      a[cnt] = sc.nextInt();
      if(a[cnt]>next){
        next = a[cnt];
        if(a[cnt]>max){
          next = max;
          max = a[cnt];
          maxi = cnt;
        }
      }
      cnt++;
    }
    cnt = 0;
    while(cnt<n){
      if(cnt!=maxi){
         System.out.println(max);
      }else{
         System.out.println(next);
      }
      cnt++;
    }
  } 
}