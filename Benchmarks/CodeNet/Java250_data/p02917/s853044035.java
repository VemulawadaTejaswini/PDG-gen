import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next()); // 整数列
    int[] A = new int[N];
    int[] B = new int[N-1];

    for (int i=0; i < N-1; i++) {
        B[i] = Integer.parseInt(sc.next()); 
    }
    int sum = 0;

    if(B.length == 1){
        System.out.println(B[0]*2);
        return;
    }else{
        sum = B[0];
        for(int i = 1; i < N-1  ;i++){
            sum += Math.min(B[i], B[i-1]);
            }
        
        }
        sum += B[N-2]; 
        System.out.println(sum);
  }
}

