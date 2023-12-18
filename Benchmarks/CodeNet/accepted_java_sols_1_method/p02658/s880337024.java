import java.util.*;
public class Main{
  public static void main(String[] args){
  	Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    long[] A=new long[N];
    long mul=1l;
    boolean flag=false;
    for(int i=0;i<N;i++){
      A[i]=sc.nextLong();
      if(A[i]==0){
        mul=0;
        flag=true;
      }
    }
    
    for(int i=0;i<N;i++){
      if(flag){
        break;
      }
      long afterMul=mul*A[i];
      long check=afterMul/A[i];
      
      if(check-1!=mul&&check!=mul&&check+1!=mul){
        mul=-1;
        break;
      }else{
        mul=afterMul;
      }
    }
      if(mul>1000000000000000000l) System.out.println(-1);
      else System.out.println(mul);
  }
}