import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next()); 
    int K = Integer.parseInt(sc.next()); 
    int Q = Integer.parseInt(sc.next()); 
    int[] A = new int[Q]; 
    int[] B = new int[N]; 
    for (int i=0; i < N; i++) {
        B[i] = K - Q;
    }
    for (int i=0; i < Q; i++) {
        B[Integer.parseInt(sc.next()) -1]++; 
    }

    for (int i=0; i < N; i++) {
        if(B[i]>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
  }
}

