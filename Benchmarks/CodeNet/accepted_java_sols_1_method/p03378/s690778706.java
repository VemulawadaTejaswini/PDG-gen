import java.util.*;

public class Main{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), M = sc.nextInt(), X = sc.nextInt();
    int arr[] = new int[N+1];
    for(int i = 1; i<=M; i++){
      int n = sc.nextInt();
      arr[n] = 1;
    }
    int opt1 = 0; //cost of going from X to 0
    int opt2 = 0; //cost of going from X to N
    for(int i = X; i>=0; i--){
      opt1 += arr[i]; 
    }
    for(int i = X; i<=N; i++){
      opt2 += arr[i]; 
    }
    System.out.println(Math.min(opt1, opt2));
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
