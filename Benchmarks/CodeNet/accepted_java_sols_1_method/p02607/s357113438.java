import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sr = new Scanner(System.in);
    int N = sr.nextInt();
    int A[] = new int[N];
    int count =0;
    for(int i=0;i<N;i++)
      A[i] = sr.nextInt();
    for(int j=0;j<N;j++){
      int a = A[j];
      if(j%2==0){
        if(a%2==1)
          count++;
      }
    }
    System.out.print(count);  
  
  }

}