import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    long N=s.nextLong();
    long cnt=0;
    if(N==0) System.out.println(0);
    else{
    for(long i=2;i<Math.sqrt(N);i++){
      if(N%i==0){
        cnt+=1;
        N=N/i;
      }
    }
    
    System.out.println(cnt+1);
    }
  }  
}