import java.util.*;

public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long A[] = new long[N];
    long ans =1;
    for(int i = 0; i<N; i++){
      A[i]=sc.nextLong();
      ans *= A[i];
    }
    if(ans>=Math.pow(10, 18)){
      System.out.println("-1");
    }else{
      System.out.println(ans);
    }
  }
}