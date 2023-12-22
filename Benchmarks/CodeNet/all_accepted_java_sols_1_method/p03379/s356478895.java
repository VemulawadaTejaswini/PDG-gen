import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int arr[] = new int[N+1];
    int srt[] = new int[N+1];
    for(int i = 1; i<=N; i++){
      arr[i] = sc.nextInt();
      srt[i] = arr[i];
    }
    Arrays.sort(srt);
    for(int i = 1; i<=N; i++){
      if(arr[i] >= srt[N/2+1]){
        System.out.println(srt[N/2]); 
      }
      else{
        System.out.println(srt[N/2+1]); 
      }
    }
  }

}


/*

pre[i] = arr[1] + arr[2] + arr[3] + arr[4] + ... + arr[i]
The question for some l and r
arr[l] + arr[l+1] + arr[l+2] + ... + arr[r]
= 
pre[r] - pre[l-1]

pre[r]   = arr[1] + arr[2] + ... + arr[l-1] + arr[l] + arr[l+1] + ... + arr[r]
-
pre[l-1] = arr[1] + arr[2] + ... + arr[l-1]

*/
