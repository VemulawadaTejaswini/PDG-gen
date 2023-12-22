import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int[] A = new int[N];
    int max=1;
    int index=0;
    for(int i=0;i<N;i++){
      A[i] = sc.nextInt();
      if(A[i]>max) {
        max=A[i];
        index=i;
      }
    }
    
    int second=1;
    for(int j=0;j<N;j++){
      if(j!=index && A[j]>second){
        second=A[j]; 
      }
    }
    
    for(int k=0;k<N;k++){
      if(k!=index){
        System.out.println(max);
    } else{
        System.out.println(second);
    }
    }

  }
}