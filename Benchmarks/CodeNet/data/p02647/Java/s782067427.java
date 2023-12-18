import java.util.*;
 
class Main{
  	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int K = sc.nextInt();
      int[] lamp = new int[N];
      int[] result = new int[N];
      for(int i=0; i<N;i++){
        lamp[i] = sc.nextInt();
      }
      for(int i=0;i<K;i++){
        for(int j=0;j<N;j++){
          int start = j - lamp[j];
          int end = j + lamp[j];
          if(start<0){
            start = 0;
          }
          if(end >=N){
            end = N-1;
          }
          for(int k=start;k<=end;k++){
            result[k]++;
          }
        }
        for(int j=0;j<N;j++){
          lamp[j] = result[j];
          result[j] =0;
        }
      }
      for(int i: lamp){
        System.out.print(i+" ");
      }
        
    }
}