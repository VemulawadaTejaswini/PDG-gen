import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /*
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    */
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] A = new int[n];
    int cnt = 0;
    for(int i=0;i<k;i++){
      A[i] = sc.nextInt();
    }
    /*
    while(sc.hasNextLine()){
      //A[cnt++] = Integer.parseInt(sc.next());
      A[cnt] = sc.nextInt();
      cnt++;
    }
    */
    int ans = 0;
    int min;
    int pos;
    for(int i=0;i<k;i++){
      min = Integer.MAX_VALUE;
      pos = 0;
      for(int j=0;j<A.length;j++){
        if( min > A[j] ){
          min = A[j];
          pos = j;
        }
      }
      A[pos] = Integer.MAX_VALUE;
      ans += min;
    }       
    System.out.println(ans);
  }
}