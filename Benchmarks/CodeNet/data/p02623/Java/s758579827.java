import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    long K = sc.nextLong();
    long A[] = new long[N];
    long B[] = new long[M];
    int count = 0;
    // long count2 = 0L;
    long sum = 0L;
    for(int i =0;i<N;i++){
      A[i] =sc.nextLong();
      if(sum + A[i]<=K){
        sum += A[i];
        count++;
      };
    }
    int index1 = count-1;
    for(int i =0;i<M;i++){
      B[i] =sc.nextLong();
      if(sum + B[i]<=K){
        sum += B[i];
        count++;
      };
    }
    int index2 = count-1-index1;
    int max = count;
    // System.out.println("この時のmax" + max);
    // System.out.println("この時のsum" + sum);
    // System.out.println("この時のindex1:" + index1);
    // System.out.println("この時のindex2:" + index2);
    loop :for(int i = index1; i>=0 ;i--){
      sum = sum - A[index1];
      count--;
      for(int j = index2+1;j<M;j++){
        if(sum + B[index2] > K){
          continue loop;
        }else{
          sum = sum + B[index2];
          count++;
          if(count > max){
            max = count;
          }
        }
      }
    }

    System.out.println(max);
    // System.out.println(index1);
    // System.out.println(index2);
  }
}

// 1000000000000001
// 9223372036854775807