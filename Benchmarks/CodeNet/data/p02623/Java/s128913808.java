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
      if(sum<=K){
        sum += A[i];
        count++;
      };
    }
    int index1 = count-1;
    for(int i =0;i<M;i++){
      B[i] =sc.nextLong();
      if(sum<=K){
        sum += B[i];
        count++;
      };
    }
    int index2 = count-1;
    // long max = count1;
    for(int i = index1; i>=0L ;i--){
      sum = sum - A[index1];
    }

    System.out.println(count);
    // System.out.println(index1);
    // System.out.println(index2);
  }
}

// 1000000000000001
// 9223372036854775807