import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for(int i=0;i<N;i++){
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    int c = A[0];
    int count = 0;
    int ans =0;
    for(int i=0;i<N;i++){
      if(c==A[i]){
        count++;
      }else{
        c = A[i];
        if(count%2==1){
          ans++;
        }
        count=1;
      }
    }
    if(count%2==1){
      ans++;
    }
     System.out.println(ans);
  }
}