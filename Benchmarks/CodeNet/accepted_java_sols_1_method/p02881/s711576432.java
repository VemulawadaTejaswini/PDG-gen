import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long startNum = (long)Math.floor(Math.sqrt(N));
    long aite = 1;
    long answer =0;
    boolean prime = true;
    for(long i=startNum;i>0;i--){
      if(N%i==0){
        aite=i;
        prime = false;
        break;
      }
    }
    if(prime){
      answer = N-1;
    }else{
      answer = ((N/aite)-1)+((aite)-1);
    }

    System.out.println(answer);
      
    
  }
  

  
}