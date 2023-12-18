import java.util.*;
public class Main {
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int count = 0;
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    long ans = 0;
    
    ans += a[n-1];
    //System.out.println(ans);
    count++;
    for(int i=n-2;i>=0;i--){
      ans += a[i];
      //System.out.println(ans);
      count++;
      if( count >= n -1 ){
        break;
      }
      ans += a[i];
      //System.out.println(ans);
      count++;
      if( count >= n -1 ){
        break;
      }
    }
    System.out.println(ans);
    /*
    int[] sum = new int[n];
    for(int i=0;i<n;i++){
      if( i == 0 ){
        sum[i] = 1;
      }else{
        sum[i] = 2;
      }
    }
    int pos = 0;
    int ans = 0;
    while(true){
      if( count > n ){
        break;
      }
      
    }
    */
    //1 2 3 4 5 6
    //No.6
    //No.5 6
    //No.4 5
    //No.3 5
    //No.2 4
    //No.1 4  6-3-5-2-4-
  }
}