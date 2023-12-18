import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[M];
    int[] B = new int[M];
    for(int i = 0;i<M;i++){
      A[i] = sc.nextInt()-1;
      B[i] = sc.nextInt()-1;
    }
    int max = 0;
    boolean[] Gray = new boolean[N];
    boolean[] Black = new boolean[N];
    boolean[] Done = new boolean[N];
    for(int Checking = 0;Checking<N;Checking++){
      if(!Done[Checking]){
        Gray = new boolean[N];
        Black = new boolean[N];
        Gray[Checking]=true;
        
        for(int k = 0;k<M;k++){
          for(int i = 0;i<N;i++){
        	if(Gray[i]){
         	  Gray[i]=false;
          	  Black[i]=true;
           	  for(int j = 0;j<M;j++){
           	    if(A[j]==i&&!Black[B[j]]&&!Gray[B[j]]){
           	      Gray[B[j]] = true;
           	    }
                if(B[j]==i&&!Black[A[j]]&&!Gray[A[j]]){
           	      Gray[A[j]] = true;
           	    }
          	  }
            }
       	  }
        }
        int Sub = 0;
        for(int i = 0;i<N;i++){
          if(Black[i]){
            Sub++;
            Done[i]=true;
          }
        }
        if(Sub>max){
          max = Sub;
        }
        
      }
      
    }
    System.out.println(max);
  }
}