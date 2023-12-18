import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int min = 0;
    int max = 0;
    int[] X = new int[N];

    for (int i = 0; i < N; i++) {
      X[i] =sc.nextInt();
      if(min > X[i] || min ==0){
        min = X[i];
      }
      if(  X[i] > max){
        max = X[i];
      }
    }

    int sum = 0;
    int  sum_min = 0;
    int tmp = 0;
    for (int j = min; j < max; j++) {
       for(int k = 0; k < N; k++){
         tmp = Math.abs(j -X[k]);
         sum = tmp * tmp + sum;
       }
       if(sum_min == 0 || sum <=sum_min){
        sum_min = sum;
       }
       sum = 0;
    }    
    System.out.println(sum_min);
  }
}

