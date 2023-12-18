import java.util.*;
public class Main {
    public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      long K = sc.nextInt();
      long A[] = new long[N];
      long B[] = new long[M];
      long reading = 0;
      
      for(int i=0;i<N;i++){
        A[i] = sc.nextInt();
      }
      for(int j=0;j<M;j++){
        B[j] = sc.nextInt();
      }
      int count = 0;
      int countA = 0;
      int countB = 0;
      while(reading<=K){
        if(countA>=N && countB>=M){
          break;
        }else if(countA>=N){
          reading = reading + B[countB];
          if(reading>K){
            break;
          }else{
            countB++;
            count++;
          }
        }else if(countB>=M){
          reading = reading + A[countA];
          if(reading>K){
            break;
          }else{
            countA++;
            count++;
          }
        }else{
          if(A[countA]<=B[countB]){
            reading = reading + A[countA];
            if(reading>K){
              break;
            }else{
              countA++;
              count++;
            }
          }else{
            reading = reading + B[countB];
            if(reading>K){
              break;
            }else{
              countB++;
              count++;
            }
          }
        }
      }
      
      System.out.println(count);

		
		
    }
}