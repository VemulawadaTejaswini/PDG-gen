import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N=sc.nextInt();

      int[] A = new int[N+1];
      int[] B = new int[N];

      for(int i=0;i<N+1;i++){
        A[i]=sc.nextInt();
      }
      for(int i=0;i<N;i++){
        B[i]=sc.nextInt();
      }

      long cnt=0;

for(int i=0;i<N;i++){

if(A[i]>=B[i]){
//////////////////////////////////
cnt = cnt + B[i];
/////////////////////////////////
}

if(A[i]<B[i]){
//////////////////////////////////
cnt = cnt + A[i];
B[i] = B[i] - A[i];
  if(A[i+1]>=B[i]){
    cnt = cnt + B[i];
    A[i+1] = A[i+1] - B[i];
  }
  else{
    cnt = cnt + A[i+1];
    A[i+1] = 0;
  }
/////////////////////////////////
}

}

System.out.println(cnt);


    }
}
