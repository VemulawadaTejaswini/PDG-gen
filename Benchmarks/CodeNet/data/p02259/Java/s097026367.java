import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    int flag=1,i,j,N,cnt=0;
    
    //scanf N
    Scanner scan = new Scanner(System.in);
    N = scan.nextInt();
    
    //making array
    int[] A;
    A = new int[N];
    
    //complete array
    for(i=0;i<N;i++){
      A[i] = scan.nextInt();
    }
    
    //bubbling 
    while(flag==1){
      flag = 0;
      for(j=N-1;j>0;j--){
        if(A[j]<A[j-1]){
          int swap = A[j];
          A[j] = A[j-1];
          A[j-1] = swap;
          cnt++; //count
          flag = 1; //to be continue
        }
      }
    }
    
    for(i=0;i<N-1;i++){
      System.out.print(A[i] + " ");
    }
    System.out.println(A[i]);
    System.out.println(cnt);

  }
}