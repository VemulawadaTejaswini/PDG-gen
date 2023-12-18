import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] array = new int[N];
    
    for(int i=0; i<N; i++){
      array[i] = sc.nextInt();
    }
    
    int M =sc.nextInt();
    for(int j=0; j<M; j++){
      int P = sc.nextInt();
      int X = sc.nextInt();
      int sum =0;
      int[] array2 = new int[N];
      for(int k=0; k<N; k++){
        if(k == (P - 1) ){  
          array2[k] = X;
        }else{
          array2[k] = array[k];
        }
      }
      for(int num : array2){
        sum += num;
      }
      System.out.println(sum);
    }
    
  }
}
