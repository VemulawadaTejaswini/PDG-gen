
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    int ans=1;
    int sub=1;
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
      if(A[i]%2==0){
        sub=sub*2;
      }
      ans=ans*3;
    }
    System.out.println(ans-sub);
  }
    


  
}
