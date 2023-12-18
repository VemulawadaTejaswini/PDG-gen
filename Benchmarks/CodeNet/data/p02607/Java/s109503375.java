import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int L =sc.nextInt();
    int A[] =new int[L];
    int ans =0;
    for(int i=0;i<L;i++){
      A[i]=sc.nextInt();
      if(i%2==0){
        if(A[i]%2==1){
          ans =ans+1;}}}
    System.out.println(ans);
  }
}